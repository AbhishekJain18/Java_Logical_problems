//Accept n Numbers from user and Return first Occurance of NO
import java.lang.*;
import java.util.*;

class IndexOfFirstOcc
{
    public static void main(String a[])
    {
        int iLength, iRet =0;
        Scanner sobj = new Scanner(System.in);
        iLength = sobj.nextInt();
        
        DisplayXRange obj = new DisplayXRange(iLength);
        
        obj.Accept();
        obj.Display();
        iRet = obj.indexFirst();
        if(iRet>0)
        {
            System.out.println("Index of no is : "+iRet);
        }
        else
        {
            System.out.println("Number is not in Array ");
        }
    }
}

class DisplayXRange
{
    private int Arr[];
    public int iNo;
    public DisplayXRange(int no)
    {
        Arr = new int[no];
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        for(int iCnt =0 ; iCnt<Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        System.out.println("Enter Number :");
        iNo= sobj.nextInt();
    }
    public void Display()
    {
        System.out.println("Elements in Array are :");
        for(int iCnt = 0 ; iCnt<Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
    public int indexFirst()
    {
        int iCnt =0;
        for(iCnt =0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                break;
            }

        }
        System.out.println(iCnt);
        if(iCnt==(Arr.length))
        {
            return -1;
        }
        else
        {
            return iCnt;
        }
    }
}