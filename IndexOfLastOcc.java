//Accept n Numbers from user and Return first Occurance of NO
import java.lang.*;
import java.util.*;

class IndexOfLastOcc
{
    public static void main(String a[])
    {
        int iLength=0,iRet = 0;
        Scanner sobj = new Scanner(System.in);
        iLength = sobj.nextInt();
        
        IndexLastX obj = new IndexLastX(iLength);
        
        obj.Accept();
        obj.Display();
       iRet = obj.indexLast();
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

class IndexLastX
{
    private int Arr[];
    public int iNo;
    public IndexLastX(int no)
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
        iNo = sobj.nextInt();
    }
    public void Display()
    {
        System.out.println("Elements in Array are :");
        for(int iCnt = 0 ; iCnt<Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
    public int indexLast()
    {
        int iCnt = 0 ;
        for(iCnt =(Arr.length -1); iCnt>=0; iCnt--)
        {
            if(Arr[iCnt]==iNo)
            {
                break;
            }
        }
        if(iCnt==-1)
        {
            return -1;
        }
        else
        {
            return iCnt;
        }
    }

}