import java.lang.*;
import java.util.*;

class RevColMatrix
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
        int i,j,k;
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
            for(j = 0 , k = Arr[i].length -1; j < (Arr[i].length/2); j++,k--)
            {
                    iTemp = Arr[j][i];
                    Arr[j][i] = Arr[k][i];
                    Arr[k][i] = iTemp;
            }
        }
        //Output
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