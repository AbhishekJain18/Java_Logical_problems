//Accept N number from user and return difference between
//summation of even elements and summation of odd elements
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class DiffSumEvenSumOdd
{
    public static void main(String arg[])
    {
            Scanner sobj = new Scanner(System.in);
            int iLength = 0, iRet =0;
            iLength = sobj.nextInt();

            DiffXEvenOdd obj = new DiffXEvenOdd(iLength);

            obj.Accept();
            obj.Display();

            iRet = obj.difference();
            System.out.println("Difference is : "+iRet);

            obj = null;
    }
}
/////////////////////////////////////////////////////
class DiffXEvenOdd
{
    private int Arr[];

    public DiffXEvenOdd(int no)
    {
        Arr = new int[no];
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Values in Array");
        for(int iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }
    }
    public void Display()
    {
        for(int iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
    public int difference()
    {
        int iSumEven = 0, iSumOdd = 0;
        for(int iCnt =0; iCnt<Arr.length; iCnt++)
        {
            if( (Arr[iCnt]%2) == 0 )
            {
                iSumEven = iSumEven + Arr[iCnt];
            }
            else
            {
                iSumOdd = iSumOdd + Arr[iCnt];
            }
        }
        return (iSumEven-iSumOdd);
    }
}