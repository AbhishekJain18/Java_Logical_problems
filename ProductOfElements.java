//Accept N number from user and display product of all elemets
import java.lang.*;
import java.util.*;

class ProductOfElements
{
    public static void main(String a[])
    {
        Scanner sobj  = new Scanner(System.in);
        int iLength = 0;
        int iRet = 0;
        System.out.println("Enter number elements of array : ");
        iLength = sobj.nextInt();

        ProductXElements obj = new ProductXElements(iLength);

        obj.Accept();
        obj.Display();
        iRet = obj.product();
        System.out.println("Product Elements are : "+iRet);
    }
}

class ProductXElements
{
    private int Arr[];
    public ProductXElements(int no)
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
    public int product()
    {
        int iProd = 1;
        for(int iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            iProd = iProd * Arr[iCnt];
        }
        return iProd;
    }
}