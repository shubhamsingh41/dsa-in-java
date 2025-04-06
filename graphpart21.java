import java.util.ArrayList;
import java.util.Stack;

public class graphpart21 {
    //topological sorting
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

        graph[2].add(new edge(2, 3));

        graph[3].add(new edge(3, 1));

        graph[4].add(new edge(4, 0));
        graph[4].add(new edge(4, 1));

        graph[5].add(new edge(5, 0));
        graph[5].add(new edge(5, 2));
    }

    public static void topsortutil(ArrayList<edge> graph[] , int curr , boolean vis[] , Stack<Integer> stack){
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                topsortutil(graph, e.dest, vis, stack);
            }
            
        }
        stack.push(curr);
    }

    public static void topsort(ArrayList<edge> graph[] , int v){
        boolean vis[] = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < v; i++) {
            if(!vis[i]){
                topsortutil(graph, i, vis, stack);
            }
            
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+ " ");
        }
    }

    public static void main(String[] args) {
        int v = 6;

        ArrayList<edge> graph[] = new ArrayList[v];
        createg(graph);

        topsort(graph, v);
    }

}
