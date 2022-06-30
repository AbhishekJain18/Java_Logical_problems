//write a program which accepts number from user and
//Display its factors in decreasing order
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class FactDesc
{
    public static void main(String arg[])
    {
        DescXFact obj = new DescXFact();

        obj.Accept();
        obj.factDesc();
    }
}
/////////////////////////////////////////////////////
class DescXFact
{
    private int iNum;
    DescXFact()
    {
        iNum =0;
    }
    public void Accept()
    {
        System.out.println("Enter Number : ");
        Scanner sobj = new Scanner(System.in);
        iNum = sobj.nextInt();
    }
    public void factDesc()
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
        for(iCnt = (iNum/2); iCnt>0; iCnt-- )
        {
            if(iNum%iCnt == 0)
            {
                System.out.print(iCnt+" ");
            }
        }
    }
}