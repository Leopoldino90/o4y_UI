/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.offer4you.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * A singleton representing the tree of product categories. Caches categories and
 * allows "efficient" operations to get the path from a category to the tree root
 * and to get all the categories in the subtree of a category.
 * The cache is an array indexed by the category id, so this works well and
 * is space efficient only if the ids are more or less contiguous.
 * 
 * @author m1lt0n
 */
public class CategoryTree {
    @PersistenceContext(unitName = "offer4you")
    private EntityManager em;
    
    private static CategoryTree categoryTree = null;
    private static CategoryFacade categoryFacade;
    private static Category[] cache;
    
    
    private CategoryTree() {
        categoryFacade = new CategoryFacade();
        int numCategories = categoryFacade.findHighestId().intValue();
        cache = new Category[numCategories];
    }
    
    public CategoryTree getCategoryTree() {
        if (categoryTree == null) {
            categoryTree = new CategoryTree();
        }
        return categoryTree;
    }
    
    /*
     * Flushes the cache.
     */
    public void flushCache(){
        int numCategories = categoryFacade.findHighestId().intValue();
        cache = new Category[numCategories];
    }
    
    /*
     * Returns a path from the root to this category as a List; the first element
     * is the root, the last the category used in the invocation.
     */
    public List<Category> getPathFromRoot(Long id) {
        List<Category> path = new ArrayList<>();
        Category category = getCategory(id);
        path.add(0, category);
        Category parent = getCategory(category.getParentId());
        while(parent != null) {
            if (cache[parent.getId().intValue()] == null) {
                cache[parent.getId().intValue()] = parent;
            }
            path.add(0, parent);
            parent = getCategory(parent.getParentId());
        }
        return path;
    }
    
    /*
     * Returns all the subcategories of the category as a List; the category used
     * in the invocation is included.
     */
    public List<Category> getAllSubcategories(Long id) {
        List<Category> subcategories = new ArrayList<>();
        subcategories.add(getCategory(id));
        for (int i = 0; i < subcategories.size(); i++) {
            for (Category subcategory : subcategories.get(i).getSubcategories()) {
                if (cache[subcategory.getId().intValue()] == null) {
                    cache[subcategory.getId().intValue()] = subcategory;
                }
                subcategories.add(subcategory);
            }
        }
        return subcategories;
    }
    
    /* 
     * Returns a category by id from the cache if cached, or from the 
     * entity manager, caching it for the next time.
     */
    private Category getCategory(Long id) {
        int intId = id.intValue();
        if (cache[intId] == null) {
            cache[intId] = categoryFacade.find(id);
        }
        return cache[intId];
    }
}
