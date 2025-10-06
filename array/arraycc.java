package array;

import java.util.Scanner;

public class arraycc {
    public static void main(String []args)
    {
        int marks[]=new int[100];

        Scanner sc=new Scanner(System.in);

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("phy marks is"+marks[0]);
        System.out.println("phy marks is"+marks[1]);
        System.out.println("phy marks is"+marks[2]);

        int prcentage= (marks[0]+marks[1]+marks[2]) / 3;

        System.out.println(prcentage);

        marks[0]=100;


    }
}
