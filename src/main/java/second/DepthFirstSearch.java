package second;
import java.util.*;

class DepthFirstSearch {
    private int numVertices;
    private LinkedList<Integer> adjLists[];
    private boolean visited[];
    private static StringBuilder result;

    DepthFirstSearch(int vertices) {
        numVertices = vertices;
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];
        result = new StringBuilder();

        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<Integer>();
    }

    private void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    private void DFS(int vertex) {
        visited[vertex] = true;
        result.append(vertex).append(" ");

        Iterator ite = adjLists[vertex].listIterator();
        while (ite.hasNext()) {
            int adj = (Integer) ite.next();
            if (!visited[adj])
                DFS(adj);
        }
    }

    public String calculate(int n, String comp, int start) {
        DepthFirstSearch g = new DepthFirstSearch(n);
        String[] edges = comp.split(";");
        for (String edge : edges) {
            String[] vertices = edge.trim().split(" ");
            int src = Integer.parseInt(vertices[0]);
            int dest = Integer.parseInt(vertices[1]);
            g.addEdge(src, dest);
        }
        g.DFS(start);
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}