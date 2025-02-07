import java.util.Scanner;
//move all one character to end
public class recurssion10 {
    public static void move(String s , int i , int count,String news) {
        if( i == s.length()){
            for (int j = 0; j < count; j++) {
                news += "x";
                
            }
            System.out.println(news);
            return;
        }
        char curchar = s.charAt(i);
        if(curchar =='x'){
            count ++;
            move(s, i+1, count, news);
        }else{
            news += curchar;
            move(s, i+1, count, news);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        move(s, 0, 0, "");

    }
}
