////program to display 5 to 1 numbers on screen
import java.lang.*;
import java.util.*;
////////////////////////////////////////////
//                  MAIN                  //
////////////////////////////////////////////
class StarXPrint
{
    public static void main(String b[])
    {
        StarXXDisplay sobj = new StarXXDisplay();
        sobj.Accept();
        sobj.display();
    }
}
/////////////////////////////////////////////////
class StarXXDisplay
{
    private int iNo;
    StarXXDisplay()
    {
        iNo=0;
    }
    public void Accept()
    {
        Scanner scobj = new Scanner(System.in);
        this.iNo=scobj.nextInt();
    }
    public void display()
    {
        while(iNo>0)
        {
            System.out.print("* ");
            iNo--;
        }
    }
}
