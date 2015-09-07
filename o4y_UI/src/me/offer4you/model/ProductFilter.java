package me.offer4you.model;

import javax.persistence.ManyToOne;

public class ProductFilter extends Filter{
    private static final long serialVersionUID = 1L;
    @ManyToOne
    private Product product;

    public ProductFilter(Product product){
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}


