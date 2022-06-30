//Accept one number from user if number is less
//than 10 then print "Hello"
//otherwise print "Demo"
import java.lang.*;
import java.util.*;
////////////////////////////////////////////
//                  MAIN                  //
////////////////////////////////////////////
class IfElseCond
{
    public static void main(String b[])
    {
        CheckXLess cobj = new CheckXLess();
        cobj.Accept();
        cobj.display();
    }
}
/////////////////////////////////////////////////
class CheckXLess
{
    private int iNo;
    CheckXLess()
    {
        iNo=0;
    }
    public void Accept()
    {
        Scanner scobj = new Scanner(System.in);
        System.out.println("Enter Number");
        this.iNo=scobj.nextInt();
    }
    public void display()
    {
        if(iNo<10)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Demo");
        }
    }
}
