package me.offer4you.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SearchData implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private OrderType orderType;

    @ElementCollection(fetch=javax.persistence.FetchType.EAGER)
    private List<Filter> filters = new ArrayList<>();

    public SearchData() { }

    public SearchData(List<Filter> filters) {
        this.filters = filters;
    }

    public Long getId() {
        return id;
    }
    
    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }
    
    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }
    
    public void addFilter(Filter filter) {
        this.filters.add(filter);
        this.filters.sort(null);
    }
}