

import java.util.*;
//print sum of n natural number
public class recurssion1 {
   public static void recur(int i,int n,int sum) {
if(i ==n+1){
    System.out.println(sum);
    return;
}
    sum += i;
    recur(i+1, n, sum);   
   }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     recur(1, n, 0);

    }
}
