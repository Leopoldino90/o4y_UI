/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.offer4you.model;

import java.util.ArrayList;
import java.util.List;
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
public class OfferFacade extends AbstractFacade<Offer> {
    @PersistenceContext(unitName = "offer4you")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OfferFacade() {
        super(Offer.class);
    }
    
    public List<Offer> findByName(String name){
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Offer> cq = cb.createQuery(Offer.class);
        Root<Offer> offer = cq.from(Offer.class);
        cq.where(cb.equal(offer.get(Offer_.name), name));
        return getEntityManager().createQuery(cq).getResultList();
    }
    
    public List<Offer> Order(OrderType orderType){
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Offer> cq = cb.createQuery(Offer.class);
        Root<Offer> offer = cq.from(Offer.class);
        switch(orderType){
            case RELEVANCE:
                break;
            case ASC_PRICE: cq.orderBy(cb.asc(offer.get(Offer_.discountedPrice)));
                break;
            case DESC_PRICE: cq.orderBy(cb.desc(offer.get(Offer_.discountedPrice)));
                break;
            case NEWEST: cq.orderBy(cb.desc(offer.get(Offer_.startDate)));
                break;
        }   
        return getEntityManager().createQuery(cq).getResultList();
    }
    
    public List<Offer> findByCategory(CategoryTree categoryTree, Long id){
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Offer> cq = cb.createQuery(Offer.class);
        Root<Offer> offer = cq.from(Offer.class);
        List<Category> subcategories = categoryTree.getAllSubcategories(id);
        for (int i = 0; i < subcategories.size(); i++)
            cq.where(cb.equal(offer.get(Offer_.category), subcategories.get(i)));
        return getEntityManager().createQuery(cq).getResultList();
    }
}
