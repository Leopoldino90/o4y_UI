package me.offer4you.model;

public class Merchant extends User {
    private static final long serialVersionUID = 1L;
    private String description;
    private String image;
    private Position headquarters;
    private String registrationNumber;

    public Merchant(String name, String email, byte[] passwordSalt,
                    byte[] passwordHash, String description, String image,
                    Position headquarters, String registrationNumber) {
        super(name, email, passwordSalt, passwordHash);
        this.description = description;
        this.image = image;
        this.headquarters = headquarters;
        this.registrationNumber = registrationNumber;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Position getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(Position headquarters) {
        this.headquarters = headquarters;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}