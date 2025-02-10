import java.util.Scanner;
//numbers of ways in which you can invite n people to your party, single or in pairs
public class recurssion18 {
   
    public static int call(int n){
    if(n <=1){
    return 1;
}

        //single 
        int way1 = call(n-1);
         //pair
         int way2 = (n-1) * call(n-2);

         return way1 +way2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = scan.nextInt();
        System.out.println(call(n));
    }
}
