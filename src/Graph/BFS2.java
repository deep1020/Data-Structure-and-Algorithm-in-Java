package Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Disconnected components such as Graph1 -> 0,1,2 and Graph2 -> 3,4 i,e there is subgraph
// In that case, we cannot take one starting point to start traversal
public class BFS2 {
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
    static void bfs(ArrayList<Edge> graph[], int V, boolean visited[], int start){
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()){
            int curr=q.remove();
            if(visited[curr]==false){
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
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
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                bfs(graph,V,visited,i);
            }
        }
    }
}
