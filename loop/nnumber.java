package loop;

import java.util.Scanner;

public class nnumber {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int number=1;
        while(number<n)
        {
            System.out.println("number is"+number);
            number++;
        }
    }
}
