import java.util.Scanner;

public class recurssion17 {
    
    //place tiles of size 1*m in a floor of size n*m
 public static int tiles(int n,int m) {
if( n == m){
    return 2;
}  

if( n < m){
    return 1;
}


 //vertically
 int ver = tiles(n-m, m);

 //horizontal
 int hor = tiles(n-1, m);

 return ver + hor;
     
 }
        
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the value of n : ");
         int n = scan.nextInt();
         System.out.print("enter the value of m : ");
         int m = scan.nextInt();
         int place =tiles(n, m);
         System.out.println("place tiles: "+ place );
    }
}

