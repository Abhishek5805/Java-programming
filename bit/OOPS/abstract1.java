package bit.OOPS;

public class abstract1 {
    public static void main(String[] args) {
        Horse sc=new Horse();
        sc.eat();
        sc.walk();

        Chicken ch=new Chicken();
        ch.eat();
        ch.walk();
    }  
}
abstract class animal{
     void eat()
     {
        System.out.println("eat");
     }
     abstract void walk();
}
class Horse extends animal{
    void walk(){
        System.out.println("wlak on 4 legs");
    }
}
class Chicken extends animal{
    void walk(){
        System.out.println("walk on 2 legs");
    }
}
