
import java.util.*;

class recurssion6 {
    //tower of hanoi
    public static void hanoi(int n, String s,String h , String d) {
       if(n==1){ 
        System.out.println("transfer disk " + n +" from " + s +" to " + d);
        return;
       }
        hanoi(n-1, s, d, h);
        System.out.println("transfer disk " + n +" from " + s +" to " + d);
        hanoi(n-1, h, s, d);

    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     hanoi(n, "s", "h", "d");
    }
}