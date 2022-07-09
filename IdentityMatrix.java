import java.lang.*;
import java.util.*;

class IdentityMatrix
{
    public static void main(String a[])
    {
    
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of row :");
        int iRow = sobj.nextInt();
        System.out.println("Enter Number of column :");
        int iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter elements :");
        int i;
        int j;
        for(i = 0; i< Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
        //input Display
        for(i = 0; i< Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
        int iTemp = 0;
        //Logic
        for(i = 0; i< Arr.length; i++)
        {
            for(j = 0; j < i; j++)
            {
                    if(Arr[i][j] == Arr[j][i])
                    {
                        break;
                    }
            }
        }
        if(i == Arr.length)
        {
            System.out.println("Matrix is identity");
        }
        else
        {
            System.out.println("Matrix is not identity");
        }


    }

}