import java.util.Scanner;
//print all seguence of string 
//bahut imp topic hai


public class recurssion13imp {
    public static void seq(String s , int i ,String news) {
       if( i == s.length()){
        System.out.println(news);
        return;
       }
        char cur = s.charAt(i);
        //to be
        seq(s, i+1, news+cur);
        //not to be

        seq(s, i+1, news);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a string =");
        String s = scan.nextLine();
        seq(s, 0, "");

    }
}
