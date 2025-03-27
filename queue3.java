public class queue3 {

        //linklist
        static class node{
            int data;
            node next;
    
            node(int data){
                this.data = data;
                next= null;
    
            }
        }
           static class queue{
            static node head= null;
            static node tail=null;
    
            public static boolean isEmpty(){
                return head==null & tail== null;
     
    
            }
            //enqueue
            public static void add(int data){
                node newnode =new node (data);
                if(tail==null){
                    tail=head=newnode;
                    return;
    
                }
                tail.next=newnode;
                tail=newnode;
    
            }
            //dequeue
            public static int removed(){
                if(isEmpty()){
                    System.out.println("empty queue");
                    return -1 ;
    
                }
                int front=head.data;
                if(head==tail){
                    tail=null;
    
                }
                head=head.next;
                return front;
            }
    
            //peek
            public static int peek(){
                if(isEmpty()){
                    System.out.println("empty queue");
                    return -1;
                }
                return head.data;
            }
        }//extra hai ye code
        
    
    
    
        public static void main (String args[]){
            queue q =new queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
    
        while(!q.isEmpty()){
        System.out.println(q.peek());
        q.removed();
    }
        }
    }

