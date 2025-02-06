
import java.util.*;
//fast and last kab dikha tha
//har baar string ka first letter capital likhna hai warna error deta hai

public class recurssion8 {
    public static int first = -1;
    public static int last = -1;

    public static void occur(String s , int i, char ele) {
        if(i == s.length()){
          System.out.println(first);
          System.out.println(last);  
          return;

        } 
        char currchar = s.charAt(i);
        if(currchar == ele){
            if(first == -1){
                first = i;
            }else{
                last = i;
            }
        }
        occur(s, i+1, ele);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        System.out.println("enter a character");
        char e = sc.next().charAt(0);

         occur(s, 0, e);
         sc.close();
    }
}
//goggle se copy kiya hua code hai
/*import java.util.*;
// Find the first and last occurrence of a character in a string using recursion
public class Recursion8 {
    public static int first = -1;
    public static int last = -1;

    public static void occur(String s, int i, char ele) {
        // Base case: If we've checked all characters in the string
        if (i == s.length()) {
            System.out.println(first);  // Print the first occurrence
            System.out.println(last);   // Print the last occurrence
            return;
        }

        // Get the current character at index 'i'
        char currchar = s.charAt(i);
        
        // If the current character matches the element (ele)
        if (currchar == ele) {
            if (first == -1) {  // If first occurrence hasn't been set
                first = i;  // Set first occurrence
            }
            last = i;  // Always update the last occurrence
        }

        // Recur with the next index
        occur(s, i + 1, ele);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Input character to search for
        System.out.print("Enter the character to search for: ");
        char e = sc.next().charAt(0); // Take character input

        // Start the recursion from index 0
        occur(s, 0, e);
        sc.close(); // Close the scanner after use
    }
}
*/
