package com.company;

/*
    Vertex Class
    Student ID - w1810803
    Student name - Dineth Chamika
 */

public class Vertex {
    int label;

    public Vertex(int label) {
        this.label = label;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }
    @Override
    public boolean equals(Object object) {
        if(this == object)
            return true;
        if(object == null || object.getClass()!= this.getClass())
            return false;
        Vertex vertex = (Vertex) object;
        return (vertex.label ==(this.label));
    }

    @Override
    public int hashCode() {
        return this.label;
    }

    @Override
    public String toString() {
        return "Vertex [label=" + label + "]";
    }
}
