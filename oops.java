

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
class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
     Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
     }
     Student(){

}
}

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

        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 18;

        Student s2 = new Student(s1);

        s2.printinfo();


    }
    
}
