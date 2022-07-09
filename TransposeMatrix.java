import java.lang.*;
import java.util.*;

class TransposeMatrix
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
        int i,j;
        for(i = 0; i< Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
        //Input
        for(i = 0; i< Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
        int iTemp = 0;
        //logic
        for(i = 0; i< Arr.length; i++)
        {
            for(j = 0; j < i; j++)      //for(j = i+1; j < Arr[i].length-1; j++)
            {
                    iTemp = Arr[i][j];
                    Arr[i][j] = Arr[j][i];
                    Arr[j][i] = iTemp;
            }
        }
        //output
        for(i = 0; i< Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }

    }

}