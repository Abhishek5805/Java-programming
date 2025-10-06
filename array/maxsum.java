package array;

public class maxsum {
    public static void maxarraysum(int number[])
    {
        int curr=0;
        int maxsum=Integer.MIN_VALUE;

                
        for(int i=0;i<number.length;i++)
        {
        int start=i;
        for(int j=i;j<number.length;j++)
        {
        int end =j;
          curr=0;
        for(int k=start;k<end;k++)
        {
            curr+=number[k];
        }
       
        System.out.println(curr);
        if(maxsum<curr)
        {
            maxsum=curr;
        }
        }
         
    }
    System.out.println("maximum sum of sub array"+maxsum);
        
        
    }
   
    public static void main(String[]args)
    {
    int numbers[]={1,5,4,7,10,80,90};
    maxarraysum(numbers);
    }
}


