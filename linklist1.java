
//import java.lang.classfile.components.ClassPrinter;


//import java.lang.classfile.components.ClassPrinter;


//import java.lang.classfile.components.ClassPrinter;


//import java.lang.classfile.components.ClassPrinter;
import java.util.LinkedList;
class ListNode {
    int val;
    ListNode next;
    
    // Constructor to initialize a node with a value
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class linklist1 {
    public ListNode removenthfromend(ListNode head , int n){
     if(head.next == null){
       return null;
     }  

     int size = 0;
     ListNode curr = head;
     while(curr != null){
        curr = curr.next;
        size++;
     }
     if(n == size ){
        return head.next;
     }
    int indextosearch = size-n;
      ListNode prev = head;
    int i = 0;
    while (i < indextosearch){
        prev = prev.next;
        i++;
    }
        prev.next = prev.next.next;
        return head;
    } 
    public static void main(String[] args) {
        linklist1 list = new linklist1();
    
        // Create a list: 1 -> 2 -> 3 -> 4 -> 5
        int[] values = {1, 2, 3, 4, 5};
    
        
        // Print the original list
        System.out.println("Original List:");
        list.printList(head);
        
        // Remove the 2nd node from the end (i.e., remove 4)
        head = list.removenthFromend(head, 2);
                // Print the modified list
                System.out.println("Modified List after removing the 2nd node from the end:");
                list.printList(head);
            }
        
        
}

