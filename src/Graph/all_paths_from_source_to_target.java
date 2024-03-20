package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class all_paths_from_source_to_target {
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
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        graph[6].add(new Edge(6,5));
    }
    static void dfs(ArrayList<Edge> graph[],int curr,boolean visited[]){
        System.out.print(curr+" ");
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(visited[e.dest]==false){
                dfs(graph,e.dest,visited);
            }
        }
    }
    static void printAllPath(ArrayList<Edge> graph[],int curr,boolean visited[],String path,int target){
        if(curr==target){
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visited[e.dest]){
                visited[curr]=true;
                printAllPath(graph,e.dest,visited,path+"-"+e.dest,target);
                visited[curr]=false;
            }
        }
    }
    public static void main(String[] args) {
        int V=7;
//            1 --- 3
//          /       |  \
//        0         |    5 --- 6
//          \       |  /
//            2 --- 4
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        int src=0,target=5;
        boolean visited[]=new boolean[V];
        printAllPath(graph,src,visited, String.valueOf(src),target);
    }
}
