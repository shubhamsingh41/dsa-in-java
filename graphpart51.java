import java.util.ArrayList;

public class graphpart51 {
    //articulation point
      static class edge{
    int src;
    int dest;
   

    public edge(int s , int d ){
        this.src = s;
        this.dest = d;
      
        }
    }
    public static void createg(ArrayList<edge> graph[]){
    for (int i = 0; i < graph.length; i++) {
        graph[i] = new ArrayList<edge>();
    }
    
    graph[0].add(new edge(0, 1));
    graph[0].add(new edge(0, 2));
    graph[0].add(new edge(0, 3));

    graph[1].add(new edge(1, 0));
    graph[1].add(new edge(1, 2));
  
    graph[2].add(new edge(2, 0));
    graph[2].add(new edge(2, 1));
   
    graph[3].add(new edge(3, 0));
    graph[3].add(new edge(3, 4));

    graph[4].add(new edge(4, 3));
   
} 
public static void dfs(ArrayList<edge> graph[] , int curr , int par , int dt[] , int low[] , boolean vis[],
                                int time , boolean ap[]){
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;
        
        for(int i = 0 ; i<graph[curr].size() ; i++){
            edge e = graph[curr].get(i);
            int neigh  = e.dest;

            if(par == neigh){
                continue;
            }else if(vis[neigh]){
                low[curr] = Math.min(low[curr], dt[neigh]);
            }else{
                dfs(graph, neigh, curr, dt, low, vis, time, ap);
                low[curr] = Math.min(low[curr], low[neigh]);
                if(dt[curr] <= low[neigh] && par != -1){
                    ap[curr] = true;
                }
                children++;
            }         
    }
    if(par == -1  && children > 1){
        ap[curr] = true;
    }
}

public static void getap(ArrayList<edge> graph[] , int v){
    int dt[] = new int[v];
    int low[] = new int[v];
    int time = 0;

    boolean vis[] = new boolean[v];
    boolean ap[] = new boolean[v];

    for(int i = 0 ; i<v ; i++){
        if(!vis[i]){
          dfs(graph, i, -1, dt, low, vis, time, ap); 
        }
    }

    for(int i =0 ; i<v ; i++){
        if(ap[i]) {
            System.out.println(" ap : " +i);
        }  
    }
}
public static void main(String[] args) {
    int V = 5;

    ArrayList<edge> graph[] = new ArrayList[V];
    createg(graph);

    getap(graph, V);
}
//bada code hai dhekna hai isko aache se
}
