import java.util.Scanner;

public class recurssion15 {
    public static String[] keypad = { ".", "abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

   public static void com(String s,int idx,String news) {
   if(idx == s.length()){
    System.out.println(news);
    return;
   }   
    char cur = s.charAt(idx);
    String map = keypad[cur - '0'];

    for(int i =0 ; i<map.length();i++){
        com(s, idx+1, news+map.charAt(i));

    }
       
   }
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("enter a string");
       String s = scan.nextLine();
       com(s, 0, "");

   }
}

