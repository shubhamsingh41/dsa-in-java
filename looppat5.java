import java.util.*;
public class looppat5 { 
     public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    int n = Sc.nextInt(); 
    for(int i=n;i>=1;i--){
        for(int j=1;j<i;j++){

        System.out.print(" ");
        }
        

    
    for(int j=0;j<=n-i;j++){
        System.out.print("*");

    }System.out.println(" ");
}
     }
    
}
