import java.util.Scanner;
//factorial of n numbers
public class recurssion2 {
   public static void recur(int i,int n,int fact) {
if(i ==n+1){
    System.out.println(fact);
    return;
}
     fact *= i;
    recur(i+1, n, fact);   
   }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     recur(1, n, 1);

    }
}
