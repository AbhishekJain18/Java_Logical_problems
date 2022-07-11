import java.lang.*;
import java.util.*;

class DiffOfDigit
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iNum = sobj.nextInt();
        int iDigit = 0;
        int iEsum = 0, iOsum = 0;
        while(iNum != 0)
        {
            iDigit = iNum % 10;
            if((iDigit % 2) == 0)
            {
                iEsum = iEsum + iDigit;
            }
            else
            {
                iOsum = iOsum + iDigit;
            }
            iNum = iNum / 10;
        }
        int Diff = iEsum - iOsum;
        System.out.println(Diff);
    }
}