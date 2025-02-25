

public class linklist {
    Node head;
    class Node{
        String data;
        Node next;

         Node(String data) {
            this.data = data;
            this.next = null;
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

    public static void main(String[] args) {
        linklist list = new linklist();
        list.addfirst("a");
        list.addfirst("is");
        list.printlist();
        list.addlast("list");
        list.printlist();
        list.addfirst("this");
        list.printlist();
    }
}
