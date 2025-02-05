public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("shubham");
        System.out.println(sb);
        //get char
        System.err.println(sb.charAt(0));
        //set char nahi chala
        //sb.setCharAt(0, "d");
      //  System.out.println(sb);
      //insert character
      sb.insert(0, 'x');
      System.out.println(sb);
      //delete character
      sb.delete(0, 1);
      System.out.println(sb);
      //append jodne kr kaam aata hai
      sb.append(" kumar singh");
      System.out.println(sb);
      //length
      System.out.println(sb.length());
    }
}
