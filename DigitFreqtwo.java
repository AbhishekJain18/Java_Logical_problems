////write a Program which accepts number from user
//and return Freq of 4 in it
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class DigitFreqtwo
{
    public static void main(String arg[])
    {
        CountXTwo obj = new CountXTwo();
        int iRet = 0;
        obj.Accept();
        iRet = obj.countTwo();
        System.out.println(+iRet);
    }
}
/////////////////////////////////////////////////////
class CountXTwo
{
    private int iNum;
    CountXTwo()
    {
        iNum =0;
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        iNum = sobj.nextInt();
    }
    public int countTwo()
    {
        int iCnt=0,iDigit = 0;

        if(iNum<0)
        {
            iNum = -iNum;
        }
        while(iNum!=0)
        {
            iDigit = iNum % 10;
            if(iDigit == 2)
            {
                iCnt++;
            }
            iNum = iNum /10;
        }
        return iCnt;
    }
}