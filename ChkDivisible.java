//Accept one number and check weather is divisible by 5 or not
import java.lang.*;
import java.util.*;

////////////////////////////////////////////
//                  MAIN                  //
////////////////////////////////////////////
class ChkDivisible
{
    public static void main(String b[])
    {
        NumberXChkDivisible nobj = new NumberXChkDivisible();
        boolean bRet = false;

        nobj.Accept();
        nobj.Display();

        bRet = nobj.check();
        if(bRet==true)
        {
            System.out.println("Number is Divisible by 5");
        }
        else
        {
            System.out.println("Number is not Divisible by 5");
        }
    }
}
/////////////////////////////////////////////////
class NumberXChkDivisible
{
    private int iNo;

    NumberXDivide()
    {
        this.iNo=0;
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        this.iNo = sobj.nextInt();
    }
    public void Display()
    {
        System.out.println("Numbers is : "+this.iNo);
    }
    public boolean check()
    {
        if((iNo%5)==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
















