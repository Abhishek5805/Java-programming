public class inheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
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
 class Fish extends animal{
    int pit;

    void swim()
    {
        System.out.println("swim");
    }
 }
