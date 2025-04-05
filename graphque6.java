import java.util.ArrayList;

public class graphque6 {
    //all path from source to target
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
   /*  public static void bfs(ArrayList<edge> graph[] , int v , boolean vis[], int start){
        Queue<Integer> q = new LinkedList<>();
       
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

    public static void dfs(ArrayList<edge> graph[] , int curr , boolean vis[]){
        System.out.print(curr +" ");
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if(vis[e.dest] == false)
            dfs(graph, e.dest, vis);
            
        }
    }
*/
    public static void  printallpath(ArrayList<edge> graph[] , boolean vis[], int curr, String path , int tar){
        if(curr == tar){
            System.out.println(path);
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                vis[curr]= true;
                printallpath(graph, vis, e.dest, path+e.dest, tar);
                vis[curr] = false;
            }
            
        }
    }
    public static void main(String[] args) {  
        int v = 7;
       
        ArrayList<edge> graph[] = new ArrayList[v];
        createg(graph);

        int src =0 ,tar = 5;
     
       
        printallpath(graph, new boolean[v], src, "0", tar);
    
     
      System.out.println();
      //is code ko apn modified dfs ka code bolte hai
      //kyuki ye dfs ka hi use krke hota hai bas code thoda change rehta hai

      
 }
}
