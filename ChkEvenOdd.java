//Accept number from user and check weather number is even or odd
import java.lang.*;
import java.util.*;
////////////////////////////////////////////
//                  MAIN                  //
////////////////////////////////////////////
class ChkEvenOdd
{
    public static void main(String b[])
    {
        EvenXOdd eobj = new EvenXOdd();
        boolean bRet = false;

        eobj.Accept();
        bRet=eobj.Check();
        if(bRet==true)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}
/////////////////////////////////////////////////
class EvenXOdd
{
    private int iNo;
    EvenXOdd()
    {
        iNo=0;
    }
    public void Accept()
    {
        Scanner scobj = new Scanner(System.in);
        System.out.println("Enter Number");
        this.iNo=scobj.nextInt();
    }
    public boolean Check()
    {
        if((iNo%2)==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
