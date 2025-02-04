
import java.util.*;

class sort{
    public static void array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
        // bubblesort muskil tha thoda bahut dhek ke kiya hu

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar= sc.nextInt();
        int arr[] = new int[ar];
        for (int i = 0; i < ar; i++) {
            arr[i] = sc.nextInt();
            
        }
       //int arr[] = {7,8,10,2,3,5};
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = 0;j<arr.length-i-1;j++){
                if( arr[j]> arr[j+1]){
                    //swap
                    int t= arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]= t;

                }
            }
            
        } array(arr);
        
    }
}

