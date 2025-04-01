
import java.util.*;

public class hashmap {
    public static void main(String[] args) {
         HashMap<String , Integer> map = new HashMap<>();


         //insertion //put use hota hai add ke liye
         map.put("india", 120);
         map.put("us", 30);
         map.put("china", 150);
         System.out.println(map);

         map.put("china", 180);
         System.out.println(map);


          /* 
         //search
         if(map.containsKey("china")){
            System.out.println("key is present in the map");
         }else{
            System.out.println("key is nor present in the map");
         }

         System.out.println(map.get("china"));//key exist
         System.out.println(map.get("indonesia"));//does not exist
         

         int arr[] = {12,15 ,18};
         for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]+" ");
             
         }
         System.out.println();

         for(int val : arr){
            System.out.print(val + " ");
         }
         System.out.println();
         

        //first tarika
         for(Map.Entry<String, Integer> e :map.entrySet()){
           System.out.println(e.getKey());
           System.out.println(e.getValue());
         }
         //second tarika
         Set<String> keys = map.keySet();
         for(String key : keys){
            System.out.println(key + " " + map.get(key));
         }  
          */
   

          map.remove("china");
          System.out.println(map);
    }  
}
