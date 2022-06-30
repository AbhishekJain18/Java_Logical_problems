//Program which accepts on Number from user and
//Display Even Fact
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class Fact
{
    public static void main(String arg[])
    {
        DisplayFact cobj = new DisplayFact();
        cobj.Accept();
        cobj.fact();
    }
}
////////////////////////////////////////////
class DisplayFact
{
    private int iNo;

    DisplayFact()
    {
        iNo = 0;
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number");
        iNo = sobj.nextInt();
    }
    public void fact()
    {
        if(iNo<0)
        {
            iNo = -iNo;
        }
        for(int iCnt =1; iCnt<=(iNo/2);  iCnt++)
        {
            if( (iNo%iCnt) == 0  )
            {
                System.out.println(iCnt);
            }
        }
    }
}

