//Program which accepts on Number from user and
//Display Even Fact
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class EvenNum
{
    public static void main(String arg[])
    {
        DisplayXEvenFact cobj = new DisplayXEvenFact();
        cobj.Accept();
        cobj.even();
    }
}
////////////////////////////////////////////
class DisplayXEvenFact
{
    private int iNo;
    private int iEven;

    DisplayXEvenFact()
    {
        iNo = 0;
        iEven =0;
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number");
        iNo = sobj.nextInt();
    }
    public void even()
    {
        if(iNo<0)
        {
            iNo = -iNo;
        }
        for(int iCnt =1; iCnt<=iNo;  iCnt++)
        {
            iEven = 2*iCnt;
            System.out.print(this.iEven+" ");
        }
    }
}

