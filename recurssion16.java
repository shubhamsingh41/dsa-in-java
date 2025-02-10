import java.util.Scanner;

public class recurssion16 {
public static int path( int i, int j , int n ,int m) {
    if(i == n-1 && j == m-1){
        return 1 ;
       }
   
    if (i  >=n || j >=m) {
    return 0;
   }
       
    
   
    //move downwards
    int down = path(i+1, j, n, m);
    //move right
    int right = path(i, j+1, n, m);

    return down + right;
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the value of n =");
        int n = scan.nextInt();
        System.out.print("enter the value of m =");
        int m = scan.nextInt();
       int total = path(0, 0, n, m);
       System.out.println(" total path : " + total);
    }
}

/*import java.util.Scanner;

public class Recursion16 {
    public static int path(int i, int j, int n, int m) {
        // If we've reached the destination (bottom-right corner)
        if (i == n-1 && j == m-1) {
            return 1; // A valid path
        }

        // If we're out of bounds (either i or j exceeds n-1 or m-1)
        if (i >= n || j >= m) {
            return 0; // No valid path
        }

        // Move downwards
        int down = path(i + 1, j, n, m);

        // Move right
        int right = path(i, j + 1, n, m);

        return down + right; // Sum of the number of paths
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Taking grid dimensions as input
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();
        System.out.print("Enter the value of m: ");
        int m = scan.nextInt();

        // Calling the recursive function and printing the result
        int total = path(0, 0, n, m);
        System.out.println("Total paths: " + total);
    }
}
*/