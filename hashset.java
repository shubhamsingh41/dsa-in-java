
import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        //creating
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//sirf unoque value enter hota hai


        //size
        System.out.println("size of set is : " + set.size());

        //print
        System.out.println(set);

        //search - contains
         if(set.contains(1)){
            System.out.println("set conatins 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contains");
        }

        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("we remove 1");
        }

      
        //iterator //imp chiz hai
        Iterator it = set.iterator();
       while(it.hasNext()){
        System.out.println(it.next());
       }
    }
}