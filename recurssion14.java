import java.util.HashSet;
import java.util.Scanner;
//unique sub sequence wala question
public class recurssion14 {
    public static void seq(String s , int i ,String news ,HashSet<String> set) {
       if( i == s.length()){
        if(set.contains(news)){
            return;
        }else{
        System.out.println(news);
        set.add(news);
        return;
        }
       }
        char cur = s.charAt(i);
        //to be
        seq(s, i+1, news+cur,set);
        //not to be

        seq(s, i+1, news ,set);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a string =");
        String s = scan.nextLine();
        HashSet<String> set = new HashSet<>();
        seq(s, 0, "",set);

    }
}

