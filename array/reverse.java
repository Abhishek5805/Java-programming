package array;

public class reverse {
    public static void reverse(int number[])
    {
        int start=0,end=number.length-1;
        while(start<end)
        {
            int temp=number[end];
            number[end]=number[start];
            number[start]=temp;

            start++;
            end--;
        }
       
    }
    public static void main(String[]args)
    {
        int number[]={1,2,5,8,6,4,10};
        reverse(number);
        for(int i=0;i<number.length;i++)
        {
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
}
