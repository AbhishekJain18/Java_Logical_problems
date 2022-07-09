import java.lang.*;
import java.util.*;

class MatrixFreqNum
{
    public static void main(String a[]){
    
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of row :");
        int iRow = sobj.nextInt();
        System.out.println("Enter Number of column :");
        int iCol = sobj.nextInt();
        System.out.println("Enter Number :");
        int iNum = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter elements :");
        int i,j;
        int iFreq = 0;

        for(i = 0; i< Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
        for(i=0; i<Arr.length; i++)
        {
            for(j=0; j<Arr[i].length; j++)
            {
                if(iNum == Arr[i][j])
                {
                    iFreq++;
                }
            }
        }

        System.out.println("Freq of "+iNum+"is"+iFreq);
    }

}