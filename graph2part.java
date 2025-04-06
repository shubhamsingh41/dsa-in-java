import java.util.ArrayList;

public class graph2part {
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
        graph[0].add(new edge(0, 2));

        graph[1].add(new edge(1, 0));

        graph[2].add(new edge(2, 3));

        graph[3].add(new edge(3, 0));

    }

    public static boolean iscycledirected(ArrayList<edge> graph[] , boolean vis[] , int curr , boolean rec[]){
        vis[curr] = true;
        rec[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if(rec[e.dest]){//cycle
                return true;
            }else if(!vis[e.dest]){
                if(iscycledirected(graph, vis, e.dest, rec)){
                    return true;
                }
            } 
        }
        rec[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int v = 4;

        ArrayList<edge> graph[] = new ArrayList[v];
        createg(graph);
        System.out.println(iscycledirected(graph, new boolean[v], 0, new boolean[v]));
    }
}
