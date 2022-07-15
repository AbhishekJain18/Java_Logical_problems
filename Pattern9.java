import java.lang.*;
import java.util.*;

class Pattern9
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int iRow = sobj.nextInt();

        System.out.println("Enter number of coloumn : ");
        int iCol = sobj.nextInt();

        int i = 0, j = 0;
        for(i = 0; i< iRow ; i++)
        {
            for(j = iCol -1; j >= 0; j--)
            {
                if(j % 2 == 0)
                {
                    System.out.print("# ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}

