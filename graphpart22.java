import java.util.ArrayList;

public class graphpart22 {
    //cycle detection
     static class edge{
        int src;
        int dest;
       

        public edge(int s , int d){
            this.src = s;
            this.dest = d;
            
        }
    }

     public static void createg(ArrayList<edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 4));

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));
        graph[1].add(new edge(1, 4));

        graph[2].add(new edge(2, 1));
        graph[2].add(new edge(2, 3));

        graph[3].add(new edge(3, 2));

        graph[4].add(new edge(4, 0));
        graph[4].add(new edge(4, 1));
        graph[4].add(new edge(4, 5));

        graph[5].add(new edge(5, 4));
    }
     public static boolean iscycleundie(ArrayList<edge> graph[], boolean vis[] , int curr , int par){
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);

            if(vis[e.dest] && e.dest != par){
                return true;
            }
            else if(!vis[e.dest]){
                if(iscycleundie(graph, vis, e.dest, curr)){
                    return true;
                }
            }

        }
        return false;
     }

    public static void main(String[] args) {
        int v = 6;

        ArrayList<edge> graph[] = new ArrayList[v];
        createg(graph);
        System.out.println(iscycleundie(graph, new boolean[v], 0, -1));
    }
}
