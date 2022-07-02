//accepts N number from user and return
//count of Even Numbers
import java.lang.*;
import java.util.*;

class FreqOfEleven
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iLength = 0,iRet = 0;

        iLength = sobj.nextInt();
        CountXEleven obj = new CountXEleven(iLength);

        obj.Accept();
        obj.Display();
        iRet = obj.countEleven();
        System.out.println("Number Eleven present in Array : "+iRet);
    }
}

class CountXEleven
{
    private int Arr[];

    public CountXEleven(int no)
    {
        Arr = new int[no];
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter elements in an array : ");
        for(int iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
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
    public int countEleven()
    {
        int iCount =0;
        for(int iCnt =0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]%11==0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}