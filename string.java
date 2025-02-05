public class string {
    public static void main(String[] args) {
        String name = "shubham";
        //concatenation
       String lname =" kumar singh";
        String fname = name +""+ lname;
        System.err.println(fname);
        //length
        System.err.println(fname.length());
        //access character
        for(int i = 0;i<fname.length();i++){
            System.out.println(fname.charAt(i));
            
        
        }
        //substring
        System.out.println(fname.substring(0,8));
        //prase
        String str ="123";
        int num = Integer.parseInt(str);
        System.out.println(num);
    }
    }
    

