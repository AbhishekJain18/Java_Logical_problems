import java.lang.*;
import java.util.*;

class ArrayDivFIve
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of elements : ");
        int iNum = sobj.nextInt();
        System.out.println("Enter elements in Array : ");
        int Arr[] = new int[iNum];
        int i = 0;
        for(i = 0; i < iNum; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i]%5) == 0)
            {
                System.out.println(Arr[i]+" ");
            }
        }
    }
}