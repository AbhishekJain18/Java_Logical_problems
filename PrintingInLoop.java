////progrma to print 5 times "Jay Ganesh" on screen
import java.lang.*;
import java.util.*;

////////////////////////////////////////////
//                  MAIN                  //
////////////////////////////////////////////
class PrintingInLoop
{
    public static void main(String b[])
    {
        Display dobj = new Display();
        dobj.display();
    }
}
/////////////////////////////////////////////////
class Display
{
    private int iNo;

    Display()
    {
        this.iNo=0;
    }
    public void display()
    {
        for(int iCnt=1; iCnt<=5; iCnt++)
        {
            System.out.println("Jay Ganesh");
        }
    }
}
















