//Accept N number from user and display Summation all elemets
import java.lang.*;
import java.util.*;

class FindSmall
{
    public static void main(String a[])
    {
        Scanner sobj  = new Scanner(System.in);
        int iLength = 0;
        int iRet = 0;
        System.out.println("Enter number elements of array : ");
        iLength = sobj.nextInt();

        FindXSmall obj = new FindXSmall(iLength);

        obj.Accept();
        obj.Display();
        iRet = obj.small();
        System.out.println("Smallest Elements is : "+iRet);
    }
}

class FindXSmall
{
    private int Arr[];
    public FindXSmall(int no)
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
    public int small()
    {
        int iMin = Arr[0];
        for(int iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            if(iMin > Arr[iCnt])
            {
                iMin = Arr[iCnt];
            }
        }
        return iMin;
    }
}