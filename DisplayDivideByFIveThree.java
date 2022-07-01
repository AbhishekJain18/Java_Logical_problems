//accepts N number from user and display all such elements
//which are divisible by 5 and 3
import java.lang.*;
import java.util.*;

class DisplayDivideByFIveThree
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iLength = 0;

        iLength = sobj.nextInt();
        DisplayXDivFiveThree obj = new DisplayXDivFiveThree(iLength);

        obj.Accept();
        obj.Display();
        obj.displayDivisibleFiveThree();
    }
}

class DisplayXDivFiveThree
{
    private int Arr[];

    public DisplayXDivFiveThree(int no)
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
        for(int iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]+" ");
        }
    }
    public void displayDivisibleFiveThree()
    {
        System.out.println("Elements are Divisible by five are : ");
        for(int iCnt =0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]%5==0 && Arr[iCnt]%3==0 )
            {
                System.out.print(Arr[iCnt]+" ");
            }
        }
    }
}