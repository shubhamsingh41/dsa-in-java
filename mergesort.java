
import java.util.Scanner;
//merge sort

public class mergesort {
    public static void conguer(int arr[],int si , int mid , int ei) {
        int merge[]= new int[ei - si +1];

        int id1 = si;
        int id2 = mid+1;
        int x = 0;
        while(id1 <= mid  && id2 <= ei){
            if(arr[id1] <= arr[id2]){
                merge[x++] = arr[id1++];
            
            } else{
                merge[x++]= arr[id2++];           
             }
        }
        while(id1 <= mid){
            merge[x++] = arr[id1++];

        }
        while(id2 <= ei){
            merge[x++] = arr[id2++];
        }
                for (int i = 0, j=si; i < merge.length ; i++,j++) {

                    arr[j] = merge[i];
        }
        
    }
    public static void divide(int arr[] , int si , int ei){
     if(si>=ei){
        return;
     }
    
           
     int   mid = si + (ei - si)/2;
       divide(arr, si,mid);
       divide(arr, mid+1, ei);

       conguer(arr ,si,mid,ei);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of a array : "); 
        int ar = sc.nextInt();
        System.out.print("enter the numbers of the array:  ");
         int arr[] = new int[ar];
         for (int i = 0; i < ar; i++) {
            arr[i] = sc.nextInt();
            //divide(arr, 0, arr.length);
         }
         divide(arr, 0, arr.length-1);
         System.out.println("the array after sorting: ");

         for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
             
         }
         System.out.print(" ");
    }
}

