////write a Program which accepts number from user
//return summation of all its non factors
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class FactSum
{
    public static void main(String arg[])
    {
        SumXFact obj = new SumXFact();

        obj.Accept();
        obj.factSum();
    }
}
/////////////////////////////////////////////////////
class SumXFact
{
    private int iNum,Sum;
    SumXFact()
    {
        iNum =0;
    }
    public void Accept()
    {
        System.out.println("Enter Number : ");
        Scanner sobj = new Scanner(System.in);
        iNum = sobj.nextInt();
    }
    public void factSum()
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
        for(iCnt = 1; iCnt<=(iNum/2); iCnt++)
        {
            if((iNum%iCnt) == 0)
            {
                Sum = Sum + iCnt;
            }
        }
        System.out.println("multiplication of factors are : "+this.Sum);
    }

}