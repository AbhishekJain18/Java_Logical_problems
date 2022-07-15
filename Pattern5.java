import java.lang.*;
import java.util.*;

class Pattern5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int iRow = sobj.nextInt();

        System.out.println("Enter number of coloumn : ");
        int iCol = sobj.nextInt();

        int i = 0, j = 0;
        int iCnt = 0;
        for(i = iRow -1; i >=0 ; i--)
        {
            for(j = 0; j< iCol; j++)
            {
                iCnt++;
                System.out.print(iCnt+" ");
            }
            System.out.println();
        }

    }
}

