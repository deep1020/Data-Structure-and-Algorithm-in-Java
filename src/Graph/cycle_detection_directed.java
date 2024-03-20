package Graph;

import java.util.ArrayList;

public class cycle_detection_directed {
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
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));

    }
    public static boolean isCycleDetected(ArrayList<Edge> graph[],boolean visited[],int curr,boolean rec[]){
        visited[curr]=true;
        rec[curr]=true; // once current element mark as true, we will add in recursive stack
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            // If neighbour exists in recursion stack, cycle is detected
            if(rec[e.dest]==true){
                return true;
            }
            // If neighbour exists in recursion stack and neighbour not visited before, call recursive function
            else if(!visited[e.dest]){
                if(isCycleDetected(graph,visited,e.dest,rec)){
                    return true;
                }
            }
        }
        rec[curr]=false;
        return false;
    }
    public static void main(String[] args) {
        int V=4;
//            1 --> 0
//                  |  ^
//                  |    3
//                  v  ^
//                  2
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        boolean visited[]=new boolean[V];
        boolean rec[]=new boolean[V];
        // To get connected components
        for(int i=0;i<V;i++){ // v=0,1
            if(!visited[i]){
                boolean isCycle=isCycleDetected(graph,visited,0,rec);
                if(isCycle){
                    System.out.println(isCycle);
                    break;
                }
                else {
                    System.out.println(isCycle);
                    break;
                }
            }
        }
    }
}
