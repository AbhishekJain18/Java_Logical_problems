////write a Program which accepts number from user
//return difference between summation and all its factors and non factors
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class ChkZeroInDigit
{
    public static void main(String arg[])
    {
        ZeroXChk obj = new ZeroXChk();
        boolean bRet = false;

        obj.Accept();
        bRet = obj.ChkDigit();
        if(bRet == true)
        {
            System.out.println("It contains Zero");
        }
        else
        {
            System.out.println("It does not contains Zero");
        }
    }
}
/////////////////////////////////////////////////////
class ZeroXChk
{
    private int iNum;
    ZeroXChk()
    {
        iNum =0;
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        iNum = sobj.nextInt();
    }
    public boolean ChkDigit()
    {
        int iDigit=0;
        boolean bRet = false;
        while(iNum!=0)
        {
            iDigit= iNum % 10;
            if(iDigit == 0)
            {
                bRet = true;
                break;
            }
            iNum = iNum / 10;
        }
        return bRet;
    }
}