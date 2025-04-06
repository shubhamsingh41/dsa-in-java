import java.util.ArrayList;
import java.util.PriorityQueue;

public class graphpart31 {
    //bellmanford algorithm
      static class edge{
    int src;
    int dest;
    int wt;

    public edge(int s , int d, int w){
        this.src = s;
        this.dest = d;
        this.wt = w;
    }
}

public static void createg(ArrayList<edge> graph[]){
    for (int i = 0; i < graph.length; i++) {
        graph[i] = new ArrayList<edge>();
    }
    
    graph[0].add(new edge(0, 1,2));
    graph[0].add(new edge(0, 2,4));

    graph[1].add(new edge(1, 2,-4));

    graph[2].add(new edge(2, 3,2));

    graph[3].add(new edge(3, 4,4));

    graph[4].add(new edge(4, 1,-1));

}
public static void bellmanford(ArrayList<edge> graph[] , int src , int v){
    int dist[] = new int[v];
    for (int i = 0; i < v; i++) {
        if(i != src){
            dist[i] = Integer.MAX_VALUE;
        }
        
    }
    for (int k = 0; k < v-1; k++) {
        for (int i = 0; i < v; i++) {
            for (int j= 0; j < graph[i].size(); j++) {
                edge e = graph[i].get(j);
                int u = e.src;
                int a = e.dest;

                if(dist[u] != Integer.MAX_VALUE && dist[u] +e.wt < dist[a]){
                    dist[a] = dist[u] + e.wt;
                }  
            }
        }  
    }

    for (int i = 0; i <dist.length ; i++) {
        System.out.print(dist[i]+" ");
    }
    System.out.println();
}
public static void main(String[] args) {
    int V = 5;

    ArrayList<edge> graph[] = new ArrayList[V];
    createg(graph);
    bellmanford(graph, 0, V);
 
    }
//bellman ford algorithm doen't work for negative weight cycles

}



