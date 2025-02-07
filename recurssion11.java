import java.util.Scanner;

public class recurssion11 {
    //removes dublicate from string
    public static boolean[] map = new boolean[26];
    public static void rem(String s,int i ,String news) {
        if(i == s.length()){
            System.out.println(news);
            return;
        }
        char cur = s.charAt(i);
        if(map[cur - 'a'] == true){
            rem(s, i+1, news);

        }else{
            news += cur;
            map[cur - 'a'] = true;
            rem(s, i+1, news);
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        rem(s, 0, "");
        
    }
    
}
