//Program which accepts on Number from user and
//Display Even Fact
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class EvenFact
{
    public static void main(String arg[])
    {
        DisplayXEvenFact cobj = new DisplayXEvenFact();
        cobj.Accept();
        cobj.evenFact();
    }
}
////////////////////////////////////////////
class DisplayXEvenFact
{
    private int iNo;

    DisplayXEvenFact()
    {
        iNo = 0;
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number");
        iNo = sobj.nextInt();
    }
    public void evenFact()
    {
        if(iNo<0)
        {
            iNo = -iNo;
        }
        for(int iCnt =1; iCnt<=(iNo/2);  iCnt++)
        {
            if( (iNo%iCnt == 0 ) && (iCnt%2 == 0) )
            {
                System.out.println(iCnt);
            }
        }
    }
}

