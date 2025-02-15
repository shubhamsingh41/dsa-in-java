import java.util.Scanner;
//pivot and partician
public class quicksort {

    public static int partician(int arr[] , int low ,int high) {
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high-1; j++) {
            if(arr[j] < pivot){
                i++;
//swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            }
            
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] =  temp;
        return i; // pivot index
        
    }
    public static void quick(int arr[] , int low , int high) {
        if(low < high){
            int piv = partician(arr,low ,high);


            quick(arr, low, piv-1);
            quick(arr, piv+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("enter the length of array: ");
        int ar = sc.nextInt();
        System.out.println("enter the numbers of array : ");
        int arr[] = new int[ar];
        for (int i = 0; i < ar; i++) {
            arr[i] = sc.nextInt();             
        }
        int n = arr.length;
        quick(arr, 0, n-1);
        System.out.println("The sortted array is ");


        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+ " ");

            
        }
        System.out.println(" ");

       }
}
