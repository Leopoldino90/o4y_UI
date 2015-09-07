package me.offer4you.model;

import javax.persistence.ManyToOne;

public class CategoryFilter extends Filter {
    private static final long serialVersionUID = 1L;
    @ManyToOne
    private Category category;

    public CategoryFilter(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}