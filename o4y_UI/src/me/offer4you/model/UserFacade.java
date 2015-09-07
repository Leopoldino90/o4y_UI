/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.offer4you.model;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Alex
 */
@Stateless
public class UserFacade extends AbstractFacade<User> {
    @PersistenceContext(unitName = "offer4you")
    private EntityManager em;
    
    // NOTE: this parameters have not been rigorously verified as good!
    public static final String ALGORITHM = "PBKDF2WithHmacSHA256";
    public static final int ITERATION_COUNT = 20000;
    public static final int SALT_SIZE = 8; // in bytes
    public static final int HASH_SIZE = 256; // in bits

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }
    
    // NOTE: this way of performing the login checks is vulnerable to timing attacks!
    public User login(String nameOrEmail, String password) {
        // check email first, to avoid access denial by registering an account with the target account's email as a name
        List<User> candidates = findByEmail(nameOrEmail);
        if (candidates.isEmpty()) { // no such email
            candidates = findByUsername(nameOrEmail);
            if (candidates.isEmpty()) { // no such user
                return null;
            } else if (candidates.size() > 1) { // duplicate usernames?
                Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, "More than one user matched while logging in with name: " + nameOrEmail);
                return null;
            }
        } else if (candidates.size() > 1) { // duplicate emails?
            Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, "More than one user matched while logging in with email: " + nameOrEmail);
            return null;
        }
        User user = candidates.get(0);
        
        // check password
        byte[] salt = user.getPasswordSalt();
        byte[] correctHash = user.getPasswordHash();
        byte[] computedHash;
        try {
            computedHash = computeHash(password, salt);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
            Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, "Failed password hash computation during login!", ex);
            return null;
        }
        if (Arrays.equals(correctHash, computedHash)) {
            return user;
        } else {
            return null;
        }
    }
    
    // FIXME: lots of duplicated code in the registration methods
    public Customer registerCustomer(String name, String email, String password, Position position) {
        // check that username and email are unique
        List<User> candidates = findByUsername(name);
        if (!candidates.isEmpty()) { // duplicate username
            return null;
        }
        candidates = findByEmail(email);
        if (!candidates.isEmpty()) { // duplicate email
            return null;
        }
        
        // generate salt, calculate password hash
        byte[] passwordSalt = generateSalt();
        byte[] passwordHash;
        try {
            passwordHash = computeHash(password, passwordSalt);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
            Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, "Failed password hash computation during registration!", ex);
            return null;
        }
        
        // create, persist and read the user (so that the id is set)
        Customer customer = new Customer(name, email, passwordSalt, passwordHash, position, null, null, null);
        create(customer);
        candidates = findByUsername(name);
        if (candidates.isEmpty()) { // no such user
            Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, "No user matched after registering username: {0}", name);
            return null;
        } else if (candidates.size() > 1) { // duplicate usernames?
            Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, "More than one user matched after registering username: {0}", name);
            return null;
        }
        return (Customer) candidates.get(0);
    }
    
    public Merchant registerMerchant(String name, String email, String password, String description, Position headquarters) {
        // check that username and email are unique
        List<User> candidates = findByUsername(name);
        if (!candidates.isEmpty()) { // duplicate username
            return null;
        }
        candidates = findByEmail(email);
        if (!candidates.isEmpty()) { // duplicate email
            return null;
        }
        
        // generate salt, calculate password hash
        byte[] passwordSalt = generateSalt();
        byte[] passwordHash;
        try {
            passwordHash = computeHash(password, passwordSalt);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
            Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, "Failed password hash computation during registration!", ex);
            return null;
        }
        
        // create, persist and read the user (so that the id is set)
        Merchant merchant = new Merchant(name, email, passwordSalt, passwordHash, description, null, headquarters, null);
        create(merchant);
        candidates = findByUsername(name);
        if (candidates.isEmpty()) { // no such user
            Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, "No user matched after registering username: {0}", name);
            return null;
        } else if (candidates.size() > 1) { // duplicate usernames?
            Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, "More than one user matched after registering username: {0}", name);
            return null;
        }
        return (Merchant) candidates.get(0);
    }
    
    public List<User> findByUsername(String name) {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root<User> user = cq.from(User.class);
        cq.where(cb.equal(user.get(User_.name), name));
        return getEntityManager().createQuery(cq).getResultList();
    }
    
    private List<User> findByEmail(String email) {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root<User> user = cq.from(User.class);
        cq.where(cb.equal(user.get(User_.email), email));
        return getEntityManager().createQuery(cq).getResultList();
    }
    
    private static byte[] generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[SALT_SIZE];
        random.nextBytes(salt);
        return salt;
    }
    
    private static byte[] computeHash(String password, byte[] salt) throws NoSuchAlgorithmException, InvalidKeySpecException {
        PBEKeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, ITERATION_COUNT, HASH_SIZE);
        SecretKeyFactory secretKeyFactory;
        secretKeyFactory = SecretKeyFactory.getInstance(ALGORITHM);
        return secretKeyFactory.generateSecret(keySpec).getEncoded();
    }
}