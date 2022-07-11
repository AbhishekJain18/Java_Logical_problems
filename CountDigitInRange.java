import java.lang.*;
import java.util.*;

class CountDigitInRange
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
            if((iDigit < 7) && (iDigit > 3))
            {
                iCnt++;
            }
            iNum = iNum / 10;
        }
        System.out.println(iCnt);
    }
}