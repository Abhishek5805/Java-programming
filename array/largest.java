package array;

public class largest {
     public static int largest(int numbers[])
     {
          int largest=Integer.MIN_VALUE;
          for(int i=0;i<numbers.length;i++)
          {
               if(largest<numbers[i])
               {
                    largest=numbers[i];

               }
          }
          return largest;

     }
     public static void main(String []args)
     {
          int numbers[]={10,4,6,8,9,70};
          System.out.println("the largestnumber is "+largest(numbers));
     }
}
