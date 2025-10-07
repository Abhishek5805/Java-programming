package bit.OOPS;

public class multilevel {
    public static void main(String[] args) {
        Dog goDog=new Dog();
        goDog.eat();
        goDog.legs=4;
        System.out.println(goDog.legs);
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
        int legs;

    }
    class Dog extends mammal{
        String breed;
    }
