package me.offer4you.model;

public class CompletedSearch {
    private Offer[] results;
    private SearchData search;

    public CompletedSearch(Offer[] results, SearchData search) {
        this.results = results;
        this.search = search;
    }
    
    public Offer[] getResults() {
        return results;
    }

    public void setResults(Offer[] results) {
        this.results = results;
    }

    public SearchData getSearch() {
        return search;
    }

    public void setSearch(SearchData search) {
        this.search = search;
    }
}