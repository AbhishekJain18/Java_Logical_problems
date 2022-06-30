////write a Program which accepts number from user
//return summation of all its non factors
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class NonFact
{
    public static void main(String arg[])
    {
        NonXFact obj = new NonXFact();

        obj.Accept();
        obj.nonFact();
    }
}
/////////////////////////////////////////////////////
class NonXFact
{
    private int iNum;
    NonXFact()
    {
        iNum =0;
    }
    public void Accept()
    {
        System.out.println("Enter Number : ");
        Scanner sobj = new Scanner(System.in);
        iNum = sobj.nextInt();
    }
    public void nonFact()
    {
        int iCnt=0;
        if(iNum==0)
        {
            return;
        }
        if(iNum<0)
        {
            iNum = -iNum;
        }
        for(iCnt = 1; iCnt<iNum; iCnt++)
        {
            if((iNum%iCnt) != 0)
            {
                System.out.print(iCnt+" ");
            }
        }
    }
}