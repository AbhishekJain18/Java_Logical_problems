////write a Program which accepts number from user
//and return Freq of 4 in it
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class DigitFreqFour
{
    public static void main(String arg[])
    {
        CountXFour obj = new CountXFour();
        int iRet = 0;
        obj.Accept();
        iRet = obj.countFour();
        System.out.println(+iRet);
    }
}
/////////////////////////////////////////////////////
class CountXFour
{
    private int iNum;
    CountXFour()
    {
        iNum =0;
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        iNum = sobj.nextInt();
    }
    public int countFour()
    {
        int iCnt=0,iDigit = 0;

        if(iNum<0)
        {
            iNum = -iNum;
        }
        while(iNum!=0)
        {
            iDigit = iNum % 10;
            if(iDigit == 4)
            {
                iCnt++;
            }
            iNum = iNum /10;
        }
        return iCnt;
    }
}