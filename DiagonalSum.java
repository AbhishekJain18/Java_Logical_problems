import java.lang.*;
import java.util.*;

class DiagonalSum
{
    public static void main(String a[]){
    
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
        int iSum = 0;

        for(i = 0; i< Arr.length; i++)
        {
            for(j = i; j >= i; j--)
            {
                iSum = iSum + Arr[i][j];
                break;
            }
        }

        System.out.println("Addition is "+iSum);
    }

}