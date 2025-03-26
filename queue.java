public class queue {

    static class que{
        static int arr[];
        static int size;
        static int rear = -1;

         que(int n) {
            arr = new int[n];
            this.size = n;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        //enqueue
        public static void add(int data){
            if(rear == size -1){
                System.out.println("full queue");
                return;
            }
            rear++;
            arr[rear] = data;

        }

        //dequeue
        public static int remove() {
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for(int i =0 ; i<rear;i++ ){
                arr[i]= arr[i+1];
            }
            rear--;
            return front;
           /*rear -- ; statement should be added as 
            * we shifted all elements to previous place so now our
            rear should also shift to its previous place
            */
        }
            //peek
            public static int peek(){
                if(isEmpty()){
                    System.out.println("empty queue");
                    return -1;
                }
                 return arr[0];
               
            }     
           }
   
    public static void main(String[] args) {
        que q = new que(6);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        //1 , 2 ,3
//jitna n ka size dunga utna hi print hoga kyu array hai fixed size rehta hai
       while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
       }
        
    }
}
