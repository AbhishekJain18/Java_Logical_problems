import java.lang.*;
import java.util.*;

class DisplayInRange
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Start : ");
        int iStart = sobj.nextInt();
        System.out.println("Enter End : ");
        int iEnd = sobj.nextInt();
        System.out.println("Enter Number of Elements : ");
        int iNum = sobj.nextInt();
        System.out.println("Enter elements in array : ");
        int Arr[] = new int[iNum];
        int i = 0;
        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i] < iEnd) && (Arr[i] > iStart))
            {
                System.out.println(Arr[i]+" ");
            }
        }
    }
}