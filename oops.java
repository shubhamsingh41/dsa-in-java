class pen{
    String color;
    String type; //ballpen , gel

    public void write(){
        System.out.println("writing something");
    }

}
//basic of oops in this code 


public class oops {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";


        pen1.write();
    }
    
}
