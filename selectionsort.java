import java.util.*;

public class selectionsort {
    public static void array( int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
            
        }
        //selection sort hai bahut time laga practice krne  mai samajna padega 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar = sc.nextInt();
        int arr[]= new int[ar];
        for (int i = 0; i < ar; i++) {
            arr[i] =sc.nextInt();

        
        }
        for (int i = 0; i <arr.length-1; i++){
            int small = i;
            for(int j=i+1;j<arr.length;j++){
                if( arr[small] > arr[j]){
                small =j;
                }
            
             int t = arr[small];
            arr[small] = arr[i];
            arr[i] =t;
            
        }
    }
         array(arr);
     
    }
    
}
