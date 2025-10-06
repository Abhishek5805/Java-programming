package array;

public class binarysearch {
    public static int binarysearch(int numbers[],int key)
    {
        int start=0,end=numbers.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(numbers[mid]==key)
            {
                System.out.println("found");

            }
            if(numbers[mid]<key)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[]args)
    {
        int numbers[]={1,4,5,7,10,14,16,20};
        int key=10;

        System.out.println("key element is"+binarysearch(numbers, key));
    }
}
