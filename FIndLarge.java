//Accept N number from user and display Summation all elemets
import java.lang.*;
import java.util.*;

class FIndLarge
{
    public static void main(String a[])
    {
        Scanner sobj  = new Scanner(System.in);
        int iLength = 0;
        int iRet = 0;
        System.out.println("Enter number elements of array : ");
        iLength = sobj.nextInt();

        FindXLarge obj = new FindXLarge(iLength);

        obj.Accept();
        obj.Display();
        iRet = obj.large();
        System.out.println("Largest Elements is : "+iRet);
    }
}

class FindXLarge
{
    private int Arr[];
    public FindXLarge(int no)
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
    public int large()
    {
        int iMax = Arr[0];
        for(int iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            if(iMax < Arr[iCnt])
            {
                iMax = Arr[iCnt];
            }
        }
        return iMax;
    }
}