package com.company;

import java.util.*;

/*
    The Graph Class
    Student ID - w1810803
    Student name - Dineth Chamika
 */

public class GraphClass {
    private Map<Vertex, List<Vertex>>adjVertices = new HashMap<>();

    public GraphClass() {
        this.adjVertices = adjVertices;
    }

    void addVertex(int label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    public void addEdge(int label1, int label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjVertices.get(v1).add(v2);
    }
    public List<Vertex> getAdjVertices(int label) {
        return adjVertices.get(new Vertex(label));
    }

    public Map<Vertex, List<Vertex>> getAdjVertices() {
        return adjVertices;
    }

    public void setAdjVertices(Map<Vertex, List<Vertex>> adjVertices) {
        this.adjVertices = adjVertices;
    }

}
