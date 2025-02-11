import java.util.*;


public class backtracking{
    public static void back( String s , String perm , int i){
        if(s.length() == 0){
            System.out.println(perm);
            return;

        }


        for(int j=0; j<s.length();j++){
            char cur = s.charAt(j);
            String news = s.substring(0 , j)  + s.substring(j+1);
            back(news , perm + cur , i+1);

        }
    }
    public static  void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a string : ");
        String s = scan.nextLine();
        back(s , "", 0 );
        
    }
}