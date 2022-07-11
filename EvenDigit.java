import java.lang.*;
import java.util.*;

class EvenDigit
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iNum = sobj.nextInt();
        int iDigit = 0;
        int iCnt = 0;
        while(iNum != 0)
        {
            iDigit = iNum % 10;
            if((iDigit % 2) == 0)
            {
                iCnt++;
            }
            iNum = iNum / 10;
        }
        System.out.println(iCnt);
    }
}