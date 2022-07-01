////write a Program which accepts number from user
//Return count digit in Range
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class DigitCountInRange
{
    public static void main(String arg[])
    {
        CountXRange obj = new CountXRange();
        int iRet = 0;

        obj.Accept();
        iRet = obj.countRange();
        System.out.println("Number of Digit in Range "+iRet);
    }
}
/////////////////////////////////////////////////////
class CountXRange
{
    private int iNum;
    private int iMax, iMin;
    CountXRange()
    {
        iNum =0;
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        iNum = sobj.nextInt();
        System.out.println("Enter max Number");
        iMax = sobj.nextInt();
        System.out.println("Enter min Number");
        iMin = sobj.nextInt();
    }
    public int countRange()
    {
        int iCnt=0,iDigit = 0;

        if(iNum<0)
        {
            iNum = -iNum;
        }
        while(iNum!=0)
        {
            iDigit = iNum % 10;
            if( (iDigit<iMax) && (iDigit>iMin) )
            {
                iCnt++;
            }
            iNum = iNum / 10;
        }
        return iCnt;
    }
}