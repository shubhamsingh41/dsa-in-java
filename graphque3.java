import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//breadth first search 

public class graphque3 {
     static class edge{
        int src;
        int dest;
       // int wt;

        public edge(int s , int d){
            this.src = s;
            this.dest = d;
            //this.wt = w;
        }
    }

    public static void createg(ArrayList<edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 3));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 4));

        graph[3].add(new edge(3, 1));
        graph[3].add(new edge(3, 4));
        graph[3].add(new edge(3, 5));

        graph[4].add(new edge(4, 2));
        graph[4].add(new edge(4, 3));
        graph[4].add(new edge(4, 5));

        graph[5].add(new edge(5, 3));
        graph[5].add(new edge(5, 4));
        graph[5].add(new edge(5, 6));

     
    }
    public static void bfs(ArrayList<edge> graph[] , int v){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[v];
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.println(curr+" ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    edge e = graph[curr].get(i);
                    q.add(e.dest);
                    
                }
            }
        }
    }
    public static void main(String[] args) {
        int v = 7;

        ArrayList<edge> graph[] = new ArrayList[v];
        createg(graph);
      bfs( graph , v);
      System.out.println();
        

    }
}
