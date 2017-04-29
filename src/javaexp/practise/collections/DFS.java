package javaexp.practise.collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class DFS {

    private int vertices;
    private LinkedList<Integer> adjMatrix[];

    public DFS(){
        
    }
    public DFS(int vertices) {
        System.out.println("Vertices"+vertices);
        this.vertices = vertices;
        adjMatrix = new LinkedList[vertices];
        System.out.println("Vertices"+vertices);
        for (int i = 0; i < vertices; i++) {
            adjMatrix[i] = new LinkedList<>();
        }
    }

    public void addEdge(int i, int j) {
        adjMatrix[i].add(j);
    }

    public void depthFirstSearch(int v) {
        boolean[] visited = new boolean[vertices];
        depthFirstSearch(v, visited);
    }

    public void depthFirstSearch(int v, boolean visited[]) {
        visited[v] = true;
        System.out.println("Vertex" + v);

        Iterator<Integer> i = adjMatrix[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            System.out.println("Adjacent"+n);
            if (!visited[n]) {
                depthFirstSearch(v, visited);
            }
        }
    }

    public static void main(String args[]) throws Exception {

        DFS dfs = new DFS(6);

        dfs.addEdge(0, 3);
        dfs.addEdge(0, 4);
        dfs.addEdge(1, 3);
        dfs.addEdge(1, 4);
        dfs.addEdge(1, 5);
        dfs.addEdge(2, 4);
        dfs.addEdge(1, 5);

        System.out.println("DFS Starting");
        dfs.depthFirstSearch(0);
    }

}
