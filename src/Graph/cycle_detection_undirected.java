package Graph;

import java.util.ArrayList;

public class cycle_detection_undirected {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        // Before it was null value in ArrayList. Now create a new ArrayList
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,4));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,4));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,2));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,4));
    }
    public static boolean isCycleUndirected(ArrayList<Edge> graph[],boolean visited[],int curr,int parent){
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(visited[e.dest]==true && parent!=e.dest){
                return true;
            }
            else if(!visited[e.dest]){
                if(isCycleUndirected(graph,visited,e.dest,curr)){ // cycle exists afterward in next iteration
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        boolean visited[]=new boolean[V];
        System.out.println(isCycleUndirected(graph,visited,0,-1));
    }
}
