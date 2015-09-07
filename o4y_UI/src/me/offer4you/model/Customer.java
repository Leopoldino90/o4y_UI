package me.offer4you.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

public class Customer extends User {
    private static final long serialVersionUID = 1L;
    private Position position;
    @ManyToMany
    private List<Interest> interests = new ArrayList<>();
    @OneToMany
    private List<Subscription> subscriptions = new ArrayList<>();
    @OneToMany
    private List<SearchData> searches = new ArrayList<>();

    public Customer(String name, String email, byte[] passwordSalt,
                    byte[] passwordHash, Position position,
                    List<Interest> interests, List<Subscription> subscriptions,
                    List<SearchData> searches) {
        super(name, email, passwordSalt, passwordHash);
        this.position = position;
        this.interests = interests;
        this.subscriptions = subscriptions;
        this.searches = searches;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Interest> getInterests() {
        return interests;
    }

    public void setInterests(List<Interest> interests) {
        this.interests = interests;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public List<SearchData> getSearches() {
        return searches;
    }

    public void setSearches(List<SearchData> searches) {
        this.searches = searches;
    }
}
