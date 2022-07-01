////write a Program which accepts number from user
//Return Diff BEtween even and odd
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class DiffEvenOddDigit
{
    public static void main(String arg[])
    {
        DiffXEvenOdd obj = new DiffXEvenOdd();
        int iRet = 0;

        obj.Accept();
        iRet = obj.diffXEvenOdd();
        System.out.println("Difference between odd and even is "+iRet);
    }
}
/////////////////////////////////////////////////////
class DiffXEvenOdd
{
    private int iNum;
    DiffXEvenOdd()
    {
        iNum =0;
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        iNum = sobj.nextInt();
    }
    public int diffXEvenOdd()
    {
        int iSumE =0 , iSumO = 0, iDigit = 0;
        if(iNum<0)
        {
            iNum = -iNum;
        }
        while(iNum!=0)
        {
            iDigit = iNum % 10;
            if((iDigit%2)!=0)
            {
                iSumO = iSumO + iDigit;
            }
            else
            {
                iSumE = iSumE + iDigit;
            }
            iNum = iNum / 10;
        }
        return (iSumE-iSumO);
    }
}