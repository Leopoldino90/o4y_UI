package me.offer4you.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
public class Subscription implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToOne
    private SearchData search;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date lastSentDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date interval;

    public Subscription() { }

    public Subscription(String name, SearchData search, Date lastSentDate, Date interval) {
        this.name = name;
        this.search = search;
        this.lastSentDate = lastSentDate;
        this.interval = interval;
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

    public SearchData getSearch() {
        return search;
    }

    public void setSearch(SearchData search) {
        this.search = search;
    }

    public Date getLastSentDate() {
        return lastSentDate;
    }

    public void setLastSentDate(Date lastSentDate) {
        this.lastSentDate = lastSentDate;
    }

    public Date getInterval() {
        return interval;
    }

    public void setInterval(Date interval) {
        this.interval = interval;
    }
}