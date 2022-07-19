import java.lang.*;
import java.util.*;

class SortingALL
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of Array : ");
        int Size = sobj.nextInt();

        ArrayX aobj = new ArrayX(Size);
        aobj.Accept();
        aobj.Display();
        aobj.InsertionSort();
        aobj.Display();
        aobj.SelectionSort();
        aobj.Display();
        aobj.BubbleSort();
        aobj.Display();
    }
}

interface SortMethod
{
    public void Accept();
    public void Display();
    public void BubbleSort();
    public void InsertionSort();
    public void SelectionSort();
}

class ArrayX implements SortMethod
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }
    protected void finalize()
    {
        Arr = null;
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Elements : ");
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements from array are : ");
        for(int i = 0; i < Arr.length; i++)
        {
           System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }

    public void BubbleSort()
    {
        int i = 0, j = 0, temp = 0;
        boolean Swap  = false;
        for(i = 0; i < Arr.length-1; i++)
        {
            Swap = false;
            for(j = 0; j < Arr.length-i-1; j++)
            {
                if(Arr[j] > Arr[j+1])
                {
                    temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                    Swap = true;
                }
            }
            if(Swap == false)
            {
                break;
            }
        }
    }

    public void InsertionSort()
    {
        int i = 0, j = 0, selected = 0;
        for(i = 1; i < Arr.length; i++)
        {
            for(j = i-1, selected = Arr[i]; (j >= 0) && (Arr[j] > selected); j--)
            {
                Arr[j+1] = Arr[j];
            }
            Arr[j+1] = selected;
        }
    }

    public void SelectionSort()
    {
        int i = 0, j = 0, Min_Index = 0, temp = 0;

        for(i = 0; j < Arr.length-1; i++)
        {
            Min_Index = i;
            for(j = i+1; j < Arr.length; j++)
            {
                if(Arr[Min_Index] > Arr[j])
                {
                    Min_Index = j;
                }
            }
            if(i != Min_Index)
            {
                temp = Arr[i];
                Arr[i] = Arr[Min_Index];
                Arr[Min_Index] = temp;
            }
        }
    }

}

