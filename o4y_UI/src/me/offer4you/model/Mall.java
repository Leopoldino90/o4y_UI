package me.offer4you.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Mall implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String image;
    private Position position;
    @ManyToOne
    private Merchant owner;
    @OneToMany
    private List<Store> stores = new ArrayList<> ();

    public Mall() { }

    public Mall(String name, String description, String image,
                Position position, Merchant owner, List<Store> stores) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.position = position;
        this.owner = owner;
        this.stores = stores;
    }
    
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Merchant getOwner() {
        return owner;
    }

    public void setOwner(Merchant owner) {
        this.owner = owner;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }
}