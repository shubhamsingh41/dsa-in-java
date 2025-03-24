import java.util.*;

public class stackclass1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
          
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}
//YE stack ka sbse simple tarika hai itna
//krne se hi stack kaam krta  hai bas starting word capital
//rakhna hai kahi kahinuska dhyaan rakhna hai
//ye sab apn ko java collection frame work se krna hai
// 5 line ko java collection frame work bolte hai