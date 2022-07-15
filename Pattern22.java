import java.lang.*;
import java.util.*;

class Pattern22
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of column : ");
        int iCol = sobj.nextInt();
        System.out.println("Enter number of Row : ");
        int iRow = sobj.nextInt();
        int i = 0, j = 0;
        if(iRow != iCol)
        {
            System.out.println("Wrong Input");
            return;
        }
        for(i = iRow-1; i >= 0; i--)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i > j){
                    System.out.print("* ");
                }
                else if (i == j){
                    System.out.print("# ");
                }
                else{
                    System.out.print("@ ");
                }
            }
            System.out.println();
        }
    }
}

