
import java.util.Scanner;

public class recurssion9 {
    public static boolean  sort(int arr[] , int i) {
        if( i == arr.length-1){
            return true;
        }
        if(arr[i]  < arr[i+1]){
            //array is sorted
            return sort(arr, i+1);
        } else {
            return false;

        }

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar = sc.nextInt();
        int arr[] = new int[ar];
        for( int i = 0;i < ar; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println  (sort(arr, 0));
    }


        
    }

