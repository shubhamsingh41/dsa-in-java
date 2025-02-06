
import java.util.*;
public class recurssion7 {
    //string ko reverse kar rahe hai recurssion ki help se
    public static void rev(String s , int i) {
    if(i == 0){ 
        System.out.println(s.charAt(i));
        return;
    }
    
        System.out.println(s.charAt(i));
    rev(s, i-1);
    
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        rev(s, s.length()-1);

}
}
