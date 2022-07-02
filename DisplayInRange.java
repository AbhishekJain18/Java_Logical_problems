//Accept n Numbers from user and display elements in Range
import java.lang.*;
import java.util.*;

class DisplayInRange
{
    public static void main(String a[])
    {
        int iLength;
        Scanner sobj = new Scanner(System.in);
        iLength = sobj.nextInt();
        
        DisplayXRange obj = new DisplayXRange(iLength);
        
        obj.Accept();
        obj.Display();
        obj.displayXRange();
    }
}

class DisplayXRange
{
    private int Arr[];
    public int iMax,iMin;
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
        iMax = sobj.nextInt();
        iMin = sobj.nextInt();
    }
    public void Display()
    {
        System.out.println("Elements in Array are :");
        for(int iCnt = 0 ; iCnt<Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
        System.out.println("Range is Starts from "+iMin+" to "+iMax);
    }
    public void displayXRange()
    {
        for(int iCnt =0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]>iMin && Arr[iCnt]<iMax)
            {
                System.out.println(Arr[iCnt]+" ");
            }
        }
    }
}