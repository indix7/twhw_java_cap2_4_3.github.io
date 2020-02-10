package com;

public class Direction implements DirectionImplement{
    private final char direction;

    public Direction(char direction) {
        this.direction = direction;
    }

    public Direction turnRight() {
        return new Direction(turn(direction, "right"));
    }

    public Direction turnLeft() {
        return new Direction(turn(direction, "left"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direction direction1 = (Direction) o;

        return (direction == direction1.direction);
    }

    @Override
    public int hashCode() {
        return (int) direction;
    }

    @Override
    public String toString() {
        return "Direction{direction=" + direction + '}';
    }

}
