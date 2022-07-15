import java.lang.*;
import java.util.*;

class Pattern2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int iRow = sobj.nextInt();

        System.out.println("Enter number of coloumn : ");
        int iCol = sobj.nextInt();

        int i = 0, j = 0;
        char ch = 'A';
        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j< iCol; j++)
            {   if(i%2 == 0)
                {
                    ch = 'A';
                    System.out.print((char)(ch+j)+" ");
                }
                else
                {
                    ch = 'a';
                    System.out.print((char)(ch+j)+" ");
                }
            }
            System.out.println();
        }

    }
}

