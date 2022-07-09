import java.lang.*;
import java.util.*;

class SparseMatrix
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
        int j,k;
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
        int iCnt = 0;
        //Logic
        for(i = 0; i< Arr.length; i++)
        {
            for(j = 0, k = (Arr[i].length-1); j<k; j++,k--)
            {
                if(Arr[i][j] == 0)
                    iCnt++;
                if(Arr[i][k] == 0)
                    iCnt++;
            }
        }
        if(((iRow * iCol) /2) < iCnt)
        {
            System.out.println("Matrix is SparseMatrix");
        }
        else if(((iRow * iCol) /2) == iCnt)
        {
            System.out.println("Equal no of zeros");
        }
        else
        {
            System.out.println("Matrix is not SparseMatrix");
        }

    }

}