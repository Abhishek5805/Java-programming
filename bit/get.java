package bit;

public class get {
    public static int getbit(int n ,int i) {
    int bitmask=1<<i;
    if((n & bitmask)==0)
    {
        return 0;
    }
    else{
        return 1;        
    }
}
public static int  setbit(int n ,int i) {
    int bitmask=1<<i;
    return n | bitmask;
    
}
public static int  clearbit(int n ,int i) {
    
    int bitmask=~(1<<i);
    return n | bitmask;
    
}

    public static void main(String[] args) {
        System.out.println(clearbit(10, 2));
    }
    
}
