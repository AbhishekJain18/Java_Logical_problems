////write a Program which accepts number from user
//Return count of even digit
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class DigitCountEven
{
    public static void main(String arg[])
    {
        CountXEven obj = new CountXEven();
        int iRet = 0;

        obj.Accept();
        iRet = obj.countEven();
        System.out.println("Number of Even digits are "+iRet);
    }
}
/////////////////////////////////////////////////////
class CountXEven
{
    private int iNum;
    CountXEven()
    {
        iNum =0;
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        iNum = sobj.nextInt();
    }
    public int countEven()
    {
        int iCnt=0,iDigit = 0;
        if(iNum<0)
        {
            iNum = -iNum;
        }
        while(iNum!=0)
        {
            iDigit = iNum % 10;
            if((iDigit%2)==0)
            {
                iCnt++;
            }
            iNum = iNum / 10;
        }
        return iCnt;
    }
}