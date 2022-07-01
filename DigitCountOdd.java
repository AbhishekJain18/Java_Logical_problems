////write a Program which accepts number from user
//Return count of odd digit
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class DigitCountOdd
{
    public static void main(String arg[])
    {
        CountXOdd obj = new CountXOdd();
        int iRet = 0;

        obj.Accept();
        iRet = obj.countOdd();
        System.out.println("Number of Odd digits are "+iRet);
    }
}
/////////////////////////////////////////////////////
class CountXOdd
{
    private int iNum;
    CountXOdd()
    {
        iNum =0;
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        iNum = sobj.nextInt();
    }
    public int countOdd()
    {
        int iCnt=0,iDigit = 0;
        if(iNum<0)
        {
            iNum = -iNum;
        }
        while(iNum!=0)
        {
            iDigit = iNum % 10;
            if((iDigit%2)!=0)
            {
                iCnt++;
            }
            iNum = iNum / 10;
        }
        return iCnt;
    }
}