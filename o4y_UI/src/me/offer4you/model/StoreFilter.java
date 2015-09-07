package me.offer4you.model;

import javax.persistence.ManyToOne;

public class StoreFilter extends Filter {
    private static final long serialVersionUID = 1L;
    @ManyToOne
    private Store store;

    public StoreFilter(Store store) {
        this.store = store;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}