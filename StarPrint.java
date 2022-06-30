////program to display 5 to 1 numbers on screen
import java.lang.*;
import java.util.*;

////////////////////////////////////////////
//                  MAIN                  //
////////////////////////////////////////////
class StarPrint
{
    public static void main(String b[])
    {
        StarXDisplay sobj = new StarXDisplay();
        sobj.Accept();
        sobj.display();
    }
}
/////////////////////////////////////////////////
class StarXDisplay
{
    private int iNo;
    StarXDisplay()
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
        for(int iCnt = 1; iCnt<=iNo; iCnt++)
        {
            System.out.print("* ");
        }
    }
}
















