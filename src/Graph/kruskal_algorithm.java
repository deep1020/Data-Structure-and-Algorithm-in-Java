package Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class kruskal_algorithm {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void createGraph(ArrayList<Edge> edges,int V){
        edges.add(new Edge(0,1,10));
        edges.add(new Edge(0,2,15));
        edges.add(new Edge(0,3,30));
        edges.add(new Edge(1,0,10));
        edges.add(new Edge(1,3,40));
        edges.add(new Edge(2,0,15));
        edges.add(new Edge(2,3,50));
        edges.add(new Edge(3,1,40));
        edges.add(new Edge(3,2,50));
    }
    static class DisjointSet {
        int[] parent;
        public DisjointSet(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++){
                parent[i] = i;
            }
        }
        public int find(int x) {
            if (parent[x] != x){
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }
        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY){
                parent[rootX] = rootY;
            }
        }
    }
    public static void kruskalAlgo(ArrayList<Edge> edges, int V){
        Collections.sort(edges, (a, b) -> a.wt - b.wt); // Sort edges by weight
        DisjointSet ds = new DisjointSet(V);
        int mstCost = 0;

        for (Edge edge : edges) {
            int rootSrc = ds.find(edge.src);
            int rootDest = ds.find(edge.dest);

            if (rootSrc != rootDest) { // Check if adding this edge creates a cycle
                mstCost += edge.wt;
                ds.union(rootSrc, rootDest);
            }
        }
        System.out.println("Minimum cost of MST: " + mstCost);
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> edges=new ArrayList<>();
        createGraph(edges,V);
        kruskalAlgo(edges,V);
    }
}
