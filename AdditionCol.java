import java.lang.*;
import java.util.*;

class AdditionCol
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
        int iSum= 0;

        for(i=0; i<Arr.length; i++)
        {
            iSum= 0;
            for(j=0; j<Arr[i].length; j++)
            {
                iSum = iSum + Arr[j][i];
            }
            System.out.println("Sum of column is"+iSum);
        }
    }

}