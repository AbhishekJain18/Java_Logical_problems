//Program to divide two numbers
import java.lang.*;
import java.util.*;
////////////////////////////////////////////
//                  MAIN                  //
////////////////////////////////////////////
class Divide
{
    public static void main(String b[])
    {
        NumberXDivide nobj = new NumberXDivide();
        int iRet = 0;

        nobj.Accept();
        nobj.Display();

        iRet = nobj.Division();
        System.out.println("Division is "+iRet);
    }
}
/////////////////////////////////////////////////
class NumberXDivide
{
    private int iNo1;
    private int iNo2;
    private int iAns;

    NumberXDivide()
    {
        this.iNo1=0;
        this.iNo2=0;
        this.iAns=0;
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter two numbers to preform division");
        this.iNo1 = sobj.nextInt();
        this.iNo2 = sobj.nextInt();
    }
    public void Display()
    {
        System.out.println("Numbers are "+this.iNo1+" "+this.iNo2);
    }
    public int Division()
    {
        if(iNo2==0)
        {
            return -1;
        }
        iAns = iNo1/iNo2;
        return iAns;
    }
}
















