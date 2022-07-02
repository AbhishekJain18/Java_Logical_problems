//accepts N number from user and Chk
//eleven is present or not
import java.lang.*;
import java.util.*;

class ChkOfEleven
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iLength = 0;
        boolean bRet = false;

        iLength = sobj.nextInt();
        CheckXEleven obj = new CheckXEleven(iLength);

        obj.Accept();
        obj.Display();
        bRet = obj.countEleven();
        if(bRet == true)
        {
            System.out.println("Eleven is present");
        }
        else
        {
            System.out.println("Eleven is not Present");
        }
    }
}

class CheckXEleven
{
    private int Arr[];

    public CheckXEleven(int no)
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
    public boolean countEleven()
    {
         boolean bChk = false;
        for(int iCnt =0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]%11==0)
            {
                bChk = true;
                break;
            }
        }
        return bChk;
    }
}