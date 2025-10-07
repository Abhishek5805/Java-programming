package bit.OOPS;

public class overloading {
    public static void main(String[] args) {
        Calculator cl=new Calculator();
        System.out.println(cl.sum(5, 4));
        System.out.println(cl.sum((float)6.4,(float) 2.2));
        System.out.println(cl.sum(2, 5, 7));
    }
}
class Calculator{
    int sum(int a,int b)
    {
        return a+b;

    }
    float sum(float a,float b)
    {
        return a+b;
    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
    }
}
