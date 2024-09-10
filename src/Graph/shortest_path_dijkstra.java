package Graph;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class shortest_path_dijkstra {
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
    public static void createGraph(ArrayList<Edge> graph[]){
        // Before it was null value in ArrayList. Now create a new ArrayList
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));
        graph[2].add(new Edge(2,4,3));
        graph[3].add(new Edge(3,5,1));
        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }
    public static class Pair implements Comparable<Pair> {
        int node;
        int dist;
        public Pair(int n,int d){
            this.node=n;
            this.dist=d;
        }
        @Override
        public int compareTo(@NotNull Pair p) {
            return this.dist-p.dist;
        }
    }
    public static void dijkstra(ArrayList<Edge> graph[],int src,int V){ // T.C -> O(E+ElogV)
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        int dist[]=new int[V];
        for(int i=0;i<V;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        boolean visited[]=new boolean[V];
        pq.add(new Pair(0,0));
        while (!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!visited[curr.node]){
                visited[curr.node]=true;
                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e=graph[curr.node].get(i);
                    if(dist[e.src]+e.wt<dist[e.dest]){
                        dist[e.dest]=dist[e.src]+e.wt;
                        // After updating distance, we need to add neighbour to queue
                        // How PriorityQueue knows there is update in the distance of neighbour
                        pq.add(new Pair(e.dest,dist[e.dest]));
                    }
                }
            }
        }
        for(int i=0;i<V;i++){
            System.out.print(dist[i]+" ");
        }
    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        dijkstra(graph,0,V);
    }
}

// T.C -> O(Elogv)
// S.C -> O(V)
