package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class topological_sorting {
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
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    public static void topologicalSort(ArrayList<Edge> graph[], int curr, boolean visited[], Stack<Integer> st){
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(visited[e.dest]==false){
                topologicalSort(graph,e.dest,visited,st);
            }
        }
        st.push(curr);
    }
    public static void top_sort(ArrayList<Edge> graph[],int V){
        boolean visited[]=new boolean[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                topologicalSort(graph,i,visited,st);
            }
        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        top_sort(graph,V);
    }
}
