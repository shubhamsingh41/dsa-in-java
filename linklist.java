

public class linklist {
    Node head;
    private int size;

     linklist() {
        this.size = 0;
    }

    
    class Node{
        String data;
        Node next;

         Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

        
    }


    //add - first , last
     public void addfirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
            
        }

        newnode.next = head;
        head = newnode;
         
     }
     public void addlast(String data){
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
            
        }
        Node currnode = head;
        while(currnode.next != null){
            currnode = currnode.next;
        }
        
          currnode.next = newnode;

     }

     //print 
     public void printlist(){
       if(head == null){
        System.out.println("list is emoty");
        return;
       }
        Node currnode = head;
        while(currnode != null){
            System.out.print(currnode.data  + "  -> "  );
            currnode = currnode.next;
        }  
        System.out.println("null");
        

     
     }

     //delete first
     public void deletefirst(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        size--;
          head = head.next;

     }
     //delete last
     public void deletelast(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        } 
        size--; 
       if(head.next == null){
        head = null;
        return;
       }

        Node secondlast = head;
        Node lastnode = head.next;
        while (lastnode.next != null) {
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        
            //not completed yaha se start krna hai
            
        }
     }

     public int getsize(){
        return size;
     }

    public static void main(String[] args) {
        linklist list = new linklist();
        list.addfirst("a");
        list.addfirst("is");
        list.printlist();
        list.addlast("list");
        list.printlist();
        list.addfirst("this");
        list.printlist();

        list.deletefirst();
        list.printlist();
        list.deletelast();
        list.printlist();

       System.out.println( list.getsize());
       list.addfirst("this");
       list.printlist();
       System.out.println(list.getsize());
    }
}
//nahi ho raha hai ye run pata nahi kya dikaat hai
