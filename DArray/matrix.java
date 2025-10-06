import java.util.Scanner;


public class matrix {

    public static void search(int matrix[][],int key)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("key found at index: "+i+" "+j);
                    return;
                }
            }
        }
        System.out.println("key not found");
        
    }
    public static void main(String[] args) {
       
        int matrix[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
         search(matrix, 5);
    }
}
