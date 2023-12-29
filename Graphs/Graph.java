package Graphs;

import java.util.*;

public class Graph {
    public static class Edge {
        private int toVertex;
        private int weight;

        public Edge(int toVertex, int weight) {
            this.toVertex = toVertex;
            this.weight = weight;
        }
    }

    private Map<Integer, List<Edge>> adjList;

    public Graph() {
        this.adjList = new HashMap<>();
    }

    public void addVertex(int label) {
        List<Edge> prevValue = this.adjList.putIfAbsent(label, new ArrayList<>());
        if (prevValue != null) {
            System.out.println("Vertex already exists!");
        }
    }

    public void removeVertex(int label) {
        this.adjList.remove(label);
        for (int vertex: this.adjList.keySet()) {
            if (vertex != label) {
                List<Edge> currVertexEdges = this.adjList.get(vertex);
                currVertexEdges.removeIf(edge -> edge.toVertex == label);
            }
        }
    }

    public void addEdge(int fromVertex, int toVertex, int weight) {
        List<Edge> edges = this.adjList.get(fromVertex);
        for (Edge edge: edges) {
            if (edge.toVertex == toVertex) {
                edge.weight = weight;
                System.out.println("Vertex already exists!");
                return;
            }
        }
        edges.add(new Edge(toVertex, weight));
    }

    public void removeEdge(int fromVertex, int toVertex) {
        List<Edge> edges = this.adjList.get(fromVertex);
        edges.removeIf(edge -> edge.toVertex == toVertex);
    }

    public List<Edge> getAdjVertices(int vertex) {
        return this.adjList.get(vertex);
    }
}
