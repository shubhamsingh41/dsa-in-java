import java.util.ArrayList;
import java.util.Scanner;
// print all the subsets of a set of first n natural numbers
public class recurssion19 {
    public  static void printsubset(ArrayList<Integer> subset){
      for (int i = 0; i <subset.size(); i++) {
        System.out.print(subset.get(i)+" ");

          
      }
      System.out.println(" ");
    }
    public static void findsubset(int n, ArrayList<Integer> subset ) {
       if( n == 0){
        printsubset(subset);
        return ;
       }
       
        //add hoga
        subset.add(n);
        findsubset(n-1, subset);

        //add nahi hoga
        subset.remove(subset.size()-1);
        findsubset(n-1, subset);

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        ArrayList<Integer> subset = new ArrayList<>();
        findsubset(n, subset);

    }
}
