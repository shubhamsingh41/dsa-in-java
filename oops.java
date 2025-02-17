class pen{
    String color;
    String type; //ballpen , gel

    public void write(){
        System.out.println("writing something");
    }
    public void printcolor(){
        System.out.println(this.color);

    }
}
//basic of oops in this code 


public class oops {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";


        pen pen2 = new pen();
        pen2.color = "black";
        pen2.type = "ballpen";

        pen1.printcolor();
        pen2.printcolor();
    }
    
}
