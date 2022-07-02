//accepts N numbers and No from user and return
//count of No Numbers
import java.lang.*;
import java.util.*;

class FreqOfNo
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iLength = 0,iRet = 0;

        iLength = sobj.nextInt();
        CountXEven obj = new CountXEven(iLength);

        obj.Accept();
        obj.Display();
        iRet = obj.countEven();
        System.out.println("Number Even elements : "+iRet);
    }
}

class CountXEven
{
    private int Arr[];
    private int No;
    public CountXEven(int no)
    {
        Arr = new int[no];

    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        Scanner sobj1 = new Scanner(System.in);
        System.out.println("Enter value of No : ");
        No = sobj.nextInt();
        System.out.println("Enter elements in an array : ");
        for(int iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj1.nextInt();
        }
    }
    public void Display()
    {
        System.out.println("Elememts in array are : ");
        for(int iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]+" ");
        }
    }
    public int countEven()
    {
        int iCount =0;
        for(int iCnt =0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]%No==0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}