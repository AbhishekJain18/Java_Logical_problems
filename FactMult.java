//Program to write which accepts number from user and
//display its multiplication of factors
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class FactMult
{
    public static void main(String arg[])
    {
        MultXFact obj = new MultXFact();

        obj.Accept();
        obj.factMult();
    }
}
/////////////////////////////////////////////////////
class MultXFact
{
    private int iNum,Mult;
    MultXFact()
    {
        iNum =0;
    }
    public void Accept()
    {
        System.out.println("Enter Number : ");
        Scanner sobj = new Scanner(System.in);
        iNum = sobj.nextInt();
    }
    public void factMult()
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
        for(iCnt = 1,Mult = 1; iCnt<=(iNum/2); iCnt++)
        {
            if((iNum%iCnt) == 0)
            {
                Mult = Mult * iCnt;
            }
        }
        System.out.println("multiplication of factors are : "+Mult);
    }

}