////write a Program which accepts number from user
//return difference between summation and all its factors and non factors
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class DiffBetnFactNFact
{
    public static void main(String arg[])
    {
        DiffXFactNFact obj = new DiffXFactNFact();
        int iRet = 0;

        obj.Accept();
        iRet = obj.diff();
        System.out.println("Difference is : "+iRet);
    }
}
/////////////////////////////////////////////////////
class DiffXFactNFact
{
    private int iNum;
    DiffXFactNFact()
    {
        iNum =0;
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        iNum = sobj.nextInt();
    }
    public int diff()
    {
        int iCnt=0,iSumNFact=0,iSumFact =0;
        if(iNum==0)
        {
            return -1;
        }
        if(iNum<0)
        {
            iNum = -iNum;
        }
        for(iCnt = 1; iCnt<=iNum; iCnt++ )
        {
            if(iNum%iCnt == 0)
            {
                iSumFact = iSumFact + iCnt;
            }
            else
            {
                iSumNFact = iSumNFact + iCnt;
            }
        }
        return (iSumFact-iSumNFact);
    }
}