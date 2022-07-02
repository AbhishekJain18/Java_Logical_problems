//Display three digit elements
import java.lang.*;
import java.util.*;

class DisplayThreeDigit
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iLength = 0;
        System.out.println("Enter number of elements in array : ");
        iLength = sobj.nextInt();

        DisplayXDigit obj = new DisplayXDigit(iLength);
        obj.Accept();
        obj.Display();
        obj.displayDigits();
    }
}

class DisplayXDigit
{
    private int Arr[];
    public DisplayXDigit(int no)
    {
        Arr = new int[no];
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter elements in Array : ");
        for(int iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }
    }
    public void Display()
    {
        System.out.println("Elements in Array : ");
        for(int iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
    public void displayDigits()
    {
        int iCnt = 0, temp =0;
        System.out.println("Three digits Elements in Array : ");
        for(int i = 0; i<Arr.length; i++)
        {
            iCnt = 0;
            temp = Arr[i];
            while(Arr[i] != 0)
            {
                iCnt++;
                Arr[i] = Arr[i] / 10;
            }
            if(iCnt == 3)
            {
                System.out.println(temp);
            }
        }
    }
}
