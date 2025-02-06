import java.util.Scanner;
//x ki power n solve kiye with stack logn
public class recurssion5 {
    public static int  recu(int i ,int n) {
    if(n==0){
        return 1;
    }
    if(i==0){
        return 0;
    }
    //if n is even
    if(n%2==0){
       return  recu(i, n/2) * recu(i, n/2);
    }
    //if n is odd
    else{
        return recu(i, n/2) * recu(i, n/2) * i;
    }
   }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value of n");
    int n = sc.nextInt();
    System.out.println("enter value of i");
    int i = sc.nextInt();
    int ans = recu(i, n);
    
    System.out.println(ans);

}
}
