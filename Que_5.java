import java.lang.*;
import java.util.*;

class Que_5
{
    public static void main(String a[])
    {
        PrintPattern obj = new PrintPattern();

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int iSize = sobj.nextInt();
        int Arr[] = new int[iSize];
        System.out.println("Enter elements of Array : ");
        for(int i  = 0 ; i < iSize ; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        obj.Display(Arr);

    }
}

class PrintPattern
{
    public void Display(int[] Arr)
    {
         for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i]; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}