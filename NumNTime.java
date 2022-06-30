//Accept two numbers from user
//Display first number in second number of times
//INPUT : 12   5
//OUTPUT : 12 12 12 12 12
import java.lang.*;
import java.util.*;
////////////////////////////////////////////
//                  MAIN                  //
////////////////////////////////////////////
class NumNTime
{
    public static void main(String b[])
    {
        DisplayXNum dobj = new DisplayXNum();
        dobj.Accept();
        dobj.display();             //for
        dobj.displayX();            //while
    }
}
/////////////////////////////////////////////////
class DisplayXNum
{
    private int iNo;
    private int iFreq;
    DisplayXNum()
    {
        iNo=0;
        iFreq=0;
    }
    public void Accept()
    {
        Scanner scobj = new Scanner(System.in);
        System.out.println("Enter Number");
        this.iNo=scobj.nextInt();
        this.iFreq=scobj.nextInt();
    }
    public void display()
    {
        for(int iCnt=1; iCnt<=iFreq; iCnt++)
        {
            System.out.print(iNo+" ");
        }
        System.out.println(" ");
    }

    public void displayX()
    {
        int iCnt=1;
        while(iCnt<=iFreq)
        {
            System.out.print(iNo+" ");
            iCnt++;
        }
    }
}
