import java.lang.*;
import java.util.*;

class Pattern4
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
        for(i = iRow -1; i >=0 ; i--)
        {
            for(j = 0; j< iCol; j++)
            {
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }

    }
}

