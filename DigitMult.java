////write a Program which accepts number from user
//Return Multiplication of Digits
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class DigitMult
{
    public static void main(String arg[])
    {
        MultX obj = new MultX();
        int iRet = 0;

        obj.Accept();
        iRet = obj.digitMult();
        System.out.println("Number of Even digits are "+iRet);
    }
}
/////////////////////////////////////////////////////
class MultX
{
    private int iNum;
    MultX()
    {
        iNum =0;
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        iNum = sobj.nextInt();
    }
    public int digitMult()
    {
        int iMult=1,iDigit = 0;
        if(iNum<0)
        {
            iNum = -iNum;
        }
        while(iNum!=0)
        {
            iDigit = iNum % 10;
            if(iDigit != 0)
            {
                iMult = iMult * iDigit;
            }
            iNum = iNum / 10;
        }
        return iMult;
    }
}