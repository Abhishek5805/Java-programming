package array;

public class linearsearch {
    public static int  linearsearch(int numbers[],int key)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args)
    {
        int numbers[]={1,5,4,7,10,80,90};
        int key=20;

        int index=linearsearch(numbers, key);
        if(index==(-1))
        {
            System.out.println("not found");
        }
        else{
            System.out.println(index);
        }
    }
}
