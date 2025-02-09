import java.util.Scanner;

public class per{
    public static void  permu(String s , String news ){
        if(s.length()==0){
            System.out.println(news);
            return;
        }
        
        for (int i = 0; i < s.length(); i++){
            char cur =s.charAt(i);
           //abc-> ab
           String newstring = s.substring(0,i)+s.substring(i+1);
           permu(newstring, news+cur);
        }    
//samajna hai pure recurssion ko ek baar aache se
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
           System.out.print("enter your string =");
            String s = scan.nextLine();
            System.out.println("so the permutation combinations are =");
            permu(s, "");

        }
    }
    