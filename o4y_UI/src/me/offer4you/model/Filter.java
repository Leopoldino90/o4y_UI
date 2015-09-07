package me.offer4you.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 * A search filter.
 * Note: this class has a natural ordering that is inconsistent with equals.
 * 
 * @author m1lt0n
 */
@Embeddable
public abstract class Filter implements Comparable<Filter>, Serializable {
    @Override
    public int compareTo(Filter other) {
        return (getOrder(this) - getOrder(other));
    }
    
    private int getOrder(Filter filter) {
        int order = 0;
        if (filter instanceof ProductFilter)           order = 1;
        else if (filter instanceof StoreFilter)        order = 2;
        else if (filter instanceof ManufacturerFilter) order = 3;
        else if (filter instanceof CategoryFilter)     order = 4;
        else if (filter instanceof PriceFilter)        order = 5;
        else if (filter instanceof TextFilter)         order = 6;
        else if (filter instanceof PositionFilter)     order = 7;        
        return order;
    }
 }