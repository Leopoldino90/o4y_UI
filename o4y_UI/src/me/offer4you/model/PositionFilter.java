package me.offer4you.model;

public class PositionFilter extends Filter {
    private static final long serialVersionUID = 1L;
    private Position position;
    private PositionFilterType type;
    private int radius;

    public PositionFilter(Position position, PositionFilterType type, int radius) {
        this.position = position;
        this.type = type;
        this.radius = radius;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public PositionFilterType getType() {
        return type;
    }

    public void setType(PositionFilterType type) {
        this.type = type;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}