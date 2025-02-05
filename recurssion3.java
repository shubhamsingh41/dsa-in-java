import java.util.Scanner;
//fibonacci sequence 

public class recurssion3 {
    public static void recur(int a,int b,int n) {
    if(n==0){
        return;
    }
        int c = a+b;
    System.out.println(c);
    recur(b, c, n-1);
   }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a =0 , b= 1;
    System.out.println(a);
    System.out.println(b);
     recur(a, b, n-2);

    }
}
