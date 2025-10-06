package bit.OOPS;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);  // prints "blue"
        p1.settip(5);
        System.out.println(p1.tip);    // prints 5
        
    }
}

class Pen {
    String color;
    int tip;

    void setcolor(String newcolor) {
        this.color = newcolor;
    }

    void settip(int newtip) {
        this.tip = newtip;
    }
}
