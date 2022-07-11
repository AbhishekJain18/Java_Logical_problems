import java.lang.*;
import java.util.*;

class MultiDigit
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iNum = sobj.nextInt();
        int iDigit = 0;
        int Mult = 1;
        while(iNum != 0)
        {
            iDigit = iNum % 10;
            if(iDigit > 0)
            {
                Mult = Mult * iDigit;
            }
            iNum = iNum / 10;
        }
        System.out.println(Mult);
    }
}