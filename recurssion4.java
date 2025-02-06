import java.util.Scanner;
//xki power n krne wala ques tha
public class recurssion4 {
  public static int  recur(int i,int n) {
    if(n==0){
        return 1;
    }
    if(i==0){
        return 0;
    }
    int x = recur(i, n-1);
     int x1 = i * x;
     return x1;
   }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value of n");
    int n = sc.nextInt();
    System.out.println("enter value of i");
    int i = sc.nextInt();
    int ans = recur(i, n);
    
    System.out.println(ans);

}
}
