////write a Program which accepts number from user
//and  print that in reverse order
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class DigitRev
{
    public static void main(String arg[])
    {
        RevXDigit obj = new RevXDigit();

        obj.Accept();
        obj.reverse();
    }
}
/////////////////////////////////////////////////////
class RevXDigit
{
    private int iNum;
    RevXDigit()
    {
        iNum =0;
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        iNum = sobj.nextInt();
    }
    public void reverse()
    {
        int iRev=0,iDigit = 0;

        if(iNum<0)
        {
            iNum = -iNum;
        }
        while(iNum!=0)
        {
            iDigit = iNum % 10;
            iRev = (iRev*10) + iDigit;
            iNum = iNum /10;
        }
        System.out.println(+iRev);
    }
}