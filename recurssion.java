public class recurssion {
  /*  public static void recur(int n) {
    //print num from 1 to 5 ke liye hai

    if(n==0){
        return;
    }
    System.out.println(n);
    recur(n-1);
       
   }
    public static void main(String[] args) {
        int n=5;
        recur(n);
    }*/
    public static void recur(int n) {
        if(n==11){
            return;
        }
        System.out.println(n);
        recur(n+1);
    }
    public static void main(String[] args) {
        int n = 1;
        recur(n);

    }
    
}
