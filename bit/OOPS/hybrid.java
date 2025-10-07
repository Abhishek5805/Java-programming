package bit.OOPS;

public class hybrid {
    public static void main(String[] args) {
        Dog dg=new Dog();
        dg.eat();

    }
}
class animal{
    String color;

    void eat()
    {
        System.out.println("eat");

    }

    void breath()
    {
        System.out.println("breath");

    }
}
class mammal extends animal{
    void leg()
    {
        System.out.println("4 legs");

    }
}
class fish extends mammal{
    void swim()
    {
        System.out.println("swim");
    }
}
class bird extends animal{
    void fly()
    {
        System.out.println("fly");
    }
}
class Dog extends mammal{
    void bark()
    {
        System.out.println("barking");
    }
}
