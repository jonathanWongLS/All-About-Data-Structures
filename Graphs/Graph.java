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
                System.out.println("Edge already exists!");
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

    public List<Integer> dfs(int source, int needle) {
        ArrayList<Boolean> seen = new ArrayList<>();
        Stack<Integer> path = new Stack<>();

        walk(source, needle, seen, path);

        if (path.isEmpty()) {
            return null;
        }

        return path;
    }

    public boolean walk(int curr, int needle, List<Boolean> seen, Stack<Integer> path) {

        if (seen.get(curr) != null) {
            return false;
        }

        seen.set(curr, true);

        // recurse
        // pre
        path.push(curr);

        if (curr == needle) {
            return true;
        }

        // recurse
        List<Edge> list = this.adjList.get(curr);
        for (int i = 0; i < list.size(); i++) {
            Edge edge = list.get(i);

            if (walk(edge.toVertex, needle, seen, path)) {
                return true;
            }
        }

        // post
        path.pop();

        return false;
    }

    private boolean hasUnvisited(ArrayList<Boolean> seen, ArrayList<Integer> dists) {
        for (int i = 0; i < seen.size(); i++) {
            if (!seen.get(i) && dists.get(i) < Integer.MAX_VALUE) {
                return true;
            }
        }

        return true;
    }

    private int getLowestUnvisited(ArrayList<Boolean> seen, ArrayList<Integer> dists) {
        int idx = -1;
        int lowestDistance = Integer.MAX_VALUE;

        for (int i = 0; i < seen.size(); i++) {
            if (seen.get(i)) {
                continue;
            }

            if (lowestDistance > dists.get(i)) {
                lowestDistance = dists.get(i);
                idx = i;
            }
        }

        return idx;
    }

    public List<Integer> dijkstra(
            int source,
            int sink
    ) {
        ArrayList<Boolean> seen = new ArrayList<>();
        ArrayList<Integer> prev = new ArrayList<>();
        for (int i = 0; i < prev.size(); i++) {
            prev.set(i, -1);
        }
        ArrayList<Integer> dists = new ArrayList<>();
        for (int i = 0; i < dists.size(); i++) {
            dists.set(i, Integer.MAX_VALUE);
        }
        dists.set(source, 0);
        while (hasUnvisited(seen, dists)) {
            int curr = getLowestUnvisited(seen, dists);
            seen.set(curr, true);

            List<Edge> adjs = this.adjList.get(curr);
            for (int i = 0; i < adjs.size(); i++) {
                Edge edge = adjs.get(i);
                if (seen.get(edge.toVertex)) {
                    continue;
                }

                int dist = dists.get(curr) + edge.weight;
                if (dist < dists.get(edge.toVertex)) {
                    dists.set(edge.toVertex, dist);
                    prev.set(edge.toVertex, curr);
                }

            }

        }
        ArrayList<Integer> out = new ArrayList<>();
        int curr = sink;

        while (prev.get(curr) != -1) {
            out.add(curr);
            curr = prev.get(curr);
        }

        out.add(source);
        return out.reversed();
    }
}
