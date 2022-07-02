//Accept N number from user and display Summation all elemets
import java.lang.*;
import java.util.*;

class SumOfElements
{
    public static void main(String a[])
    {
        Scanner sobj  = new Scanner(System.in);
        int iLength = 0;
        int iRet = 0;
        System.out.println("Enter number elements of array : ");
        iLength = sobj.nextInt();

        SumXElements obj = new SumXElements(iLength);

        obj.Accept();
        obj.Display();
        iRet = obj.summation();
        System.out.println("Summation Elements are : "+iRet);
    }
}

class SumXElements
{
    private int Arr[];
    public SumXElements(int no)
    {
        Arr = new int[no];
    }
    public void Accept()
    {
        Scanner sobj  = new Scanner(System.in);
        System.out.println("Enter elements of array : ");
        for(int iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
    public void Display()
    {
        Scanner sobj  = new Scanner(System.in);
        System.out.println("Elements of array : ");
        for(int iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
    public int summation()
    {
        int iSum = 0;
        for(int iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return iSum;
    }
}