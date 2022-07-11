import java.lang.*;
import java.util.*;

class NumLastOcc
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iNo = sobj.nextInt();
        System.out.println("Enter Number of Elements : ");
        int iNum = sobj.nextInt();
        System.out.println("Enter elements in array : ");
        int Arr[] = new int[iNum];
        int i = 0;
        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        for(i=(Arr.length-1) ; i>=0; i--)
        {
            if(Arr[i] == iNo)
            {
                break;
            }
        }
        if(i == 0)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println(i);
        }
    }
}