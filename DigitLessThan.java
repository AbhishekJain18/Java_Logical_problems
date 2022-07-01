////write a Program which accepts number from user
//return the count of digit less than 6
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class DigitLessThan
{
    public static void main(String arg[])
    {
        LessThanSix obj = new LessThanSix();
        int iRet = 0;

        obj.Accept();
        iRet = obj.digCount();
        System.out.println( iRet+" Digits are Less than Six");
    }
}
/////////////////////////////////////////////////////
class LessThanSix
{
    private int iNum;
    LessThanSix()
    {
        iNum =0;
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        iNum = sobj.nextInt();
    }
    public int digCount()
    {
        int iCnt=0,iDigit = 0;

        if(iNum<0)
        {
            iNum = -iNum;
        }
        while(iNum!=0)
        {
            iDigit = iNum % 10;
            if(iDigit<6)
            {
                iCnt++;
            }
            iNum = iNum /10;
        }
        return iCnt;
    }
}