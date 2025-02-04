
import java.util.*;


class insertionsort{
    public static void array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }//kar toh yebhi liya hu but kyu kiye aisa dought hai 
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar = sc.nextInt();
        int arr[] = new int[ar];
        for (int i = 0; i < ar; i++) {
            arr[i]= sc.nextInt();
        
            
        } for (int i = 0; i <arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while( j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
        arr[j+1] = current;
        }
    array(arr);

    }
 }