import java.lang.*;
import java.util.*;

class SwapConsecutiveRow
{
    public static void main(String a[]){
    
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of row :");
        int iRow = sobj.nextInt();
        System.out.println("Enter Number of column :");
        int iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        if((iRow % 2) != 0)
        {
            return;
        }

        System.out.println("Enter elements :");
        int i,j,k;
        for(i = 0; i< Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
        int iTemp= 0;
        for(i = 0; i< Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]);
            }
            System.out.println();
        }
        for(i=0, k = i+1; i<(Arr.length-2); i = i+2)
        {
            for(j=0; j<Arr[i].length; j++)
            {
                iTemp = Arr[i][j];
                Arr[i][j] = Arr[k][j];
                Arr[k][j] = iTemp;
            }
        }
                    System.out.println();

        for(i = 0; i< Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]);
            }
            System.out.println();
        }
    }

}