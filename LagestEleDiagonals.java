import java.lang.*;
import java.util.*;

class LagestEleDiagonals
{
    public static void main(String a[]){
    
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
        int iMax = Arr[0][0];

        for(i = 0, k = Arr.length-1; i< Arr.length && k>=0; i++,k--)
        {
            for(j = i; j >= i; j--)
            {
                if(iMax < Arr[i][j])
                {
                    iMax = Arr[i][j];
                }
                if(iMax < Arr[i][k])
                {
                    iMax = Arr[i][k];
                }
            }
        }
       System.out.println("Largest Element in Matrix is"+iMax);
    }

}