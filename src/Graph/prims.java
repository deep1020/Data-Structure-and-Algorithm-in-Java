package Graph;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class prims {
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
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));
        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));
        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;
        public Pair(int n,int c){
            this.node=n;
            this.cost=c;
        }
        @Override
        public int compareTo(@NotNull Pair p) {
            return this.cost-p.cost; // ascending order
        }
    }
    public static void primsAlgo(ArrayList<Edge> graph[],int V){
        PriorityQueue<Pair> pq=new PriorityQueue<>(); // Non-MST set
        boolean visited[]=new boolean[V]; // MST set
        pq.add(new Pair(0,0));
        int mstCost=0;
        while (!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!visited[curr.node]){
                visited[curr.node]=true;
                mstCost+= curr.cost;
                for (int i=0;i<graph[curr.node].size();i++){
                    Edge e=graph[curr.node].get(i);
                    if(!visited[e.dest]){ // Look MST to Non-MST node i.e one node from pq and another node that is not visited
                        pq.add(new Pair(e.dest,e.wt));
                    }
                }
            }
        }
        System.out.println("Minimum cost of MST: "+mstCost);
    }

    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        primsAlgo(graph,V);
    }
}

// T.C -> O(ElogV)
// S.C -> O(V+E)