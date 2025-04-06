import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;
//dijisktra algorithm
public class graphpart3 {
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

    graph[1].add(new edge(1, 3,7));
    graph[1].add(new edge(1, 2,1));

    graph[2].add(new edge(2, 4,3));

    graph[3].add(new edge(3, 5,1));

    graph[4].add(new edge(4, 3,2));
    graph[4].add(new edge(4, 5,5));

}
public static class pair implements Comparable<pair>{
    int node;
    int dist;

    public pair(int n , int d){
        this.node = n;
        this.dist = d;
    }
    @Override
    public int compareTo(pair p2){
        return this.dist - p2.dist;//asending
    }
}

public static void dijkstra(ArrayList<edge> graph[] , int src,int v){
    PriorityQueue<pair> pq = new PriorityQueue<>();
    int dist[] = new int[v];
    for (int i = 0; i < v; i++) {
        if( i != src){
           dist[i]= Integer.MAX_VALUE; 
        }
        
    }
    boolean vis[] = new boolean[v];
    pq.add(new pair(0, 0));

    while(!pq.isEmpty()){
        pair curr = pq.remove();
        if(!vis[curr.node]){
            vis[curr.node]= true;

            for(int i = 0; i < graph[curr.node].size(); i++) {
                edge e = graph[curr.node].get(i);
                int u =e.src;
                int V = e.dest;
                if(dist[u] + e.wt <dist[V]){//relaxation
                    dist[V] = dist[u] + e.wt;    
                     pq.add(new pair(V , dist[V]));
                }
                
            }
        }
    }
    for (int i = 0; i < v; i++) {
        System.out.print(dist[i] + " ");
        
    }
    System.out.println();
}
public static void main(String[] args) {
    int v = 6;

    ArrayList<edge> graph[] = new ArrayList[v];
    createg(graph);

   dijkstra(graph, 0, v);
}

}
//muskil hai code but imp hai 
