package me.offer4you.model;

public class TextFilter extends Filter {
    private static final long serialVersionUID = 1L;
    private String text;

    public TextFilter(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}