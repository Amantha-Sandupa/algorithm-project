package com.company;

/*
    PointCoordinate Class
    Student ID - w1810803
    Student name - Dineth Chamika
 */

public class PointCoordinate {
    private int id;
    private int x;
    private int y;
    private Character character;

    public PointCoordinate(int id, int x, int y, Character character) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.character = character;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "PointCoordinate{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                ", character=" + character +
                '}';
    }
}
