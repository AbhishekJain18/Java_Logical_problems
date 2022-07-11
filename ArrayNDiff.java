import java.lang.*;
import java.util.*;

class ArrayNDiff
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of elements : ");
        int iNum = sobj.nextInt();
        System.out.println("Enter elements in Array : ");
        int Arr[] = new int[iNum];

        int i = 0,Esum = 0, Osum = 0, Diff = 0;
        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i]%2) == 0)
            {
                Esum = Esum + Arr[i];
            }
            else
            {
                Osum = Osum + Arr[i];
            }
        }
        Diff = Esum - Osum;
        System.out.println(Diff);
    }
}