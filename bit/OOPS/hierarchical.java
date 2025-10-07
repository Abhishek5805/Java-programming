package bit.OOPS;

public class hierarchical {
    public static void main(String[] args) {
        Bird br=new Bird();
        br.eat();
        br.breath();
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
class fish extends animal{
    void swim()
    {
        System.out.println("swim");
    }
}
class Bird extends animal{
    void fly()
    {
        System.out.println("fly");
    }
}
