import java.util.*;
public class hashing4 {
    //find itinerary from tickets
    //itinerary means journey ya path
    public static String getstart(HashMap<String , String> tick){
        HashMap<String , String> revMap = new HashMap<>();
//string ka s bada rakhna hai isme wo dhyaan dena hai or bada isliye rakhna hai kyuki 
//static string liya hu isliye
        for(String key : tick.keySet()){
            revMap.put(tick.get(key), key);
        }

        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String , String> tickets = new HashMap<>();
        tickets.put("chennai", "bengaluru");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");

       String start = getstart(tickets);

       while(tickets.containsKey(start)){
        System.out.print(start + " -> ");
        start = tickets.get(start);
       }
       System.out.println(start);
    }
}
