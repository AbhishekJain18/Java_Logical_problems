import java.lang.*;
import java.util.*;

class Que_1
{
    public static void main(String a[])
    {
        RevEleOfArray obj = new RevEleOfArray();
        Scanner sobj = new Scanner(System.in);
        int UpdatedArray[];

        System.out.println("Enter size of array : ");
        int Size = sobj.nextInt();
        int Arr[] = new int[Size];
        System.out.println("Enter elements in array : ");
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        UpdatedArray = obj.ReverseArray(Arr);
        for(int i = 0; i < UpdatedArray.length; i++)
        {
            System.out.print(UpdatedArray[i]+" ");
        }
    }
}

class RevEleOfArray
{
    public int ArrNEW[];
    public int[] ReverseArray(int Arr[])
    {
        ArrNEW = new int[Arr.length];
        for (int i = 0; i < Arr.length ; i++)
        {
            ArrNEW[i] = ReverseELement(Arr[i]);
        }
        return ArrNEW;
    }
    public int ReverseELement(int iNo)
    {
        int Num = 0;
        while(iNo != 0)
        {
            Num = (Num * 10) + (iNo % 10);
            iNo = iNo / 10;
        }
        return Num;
    }
}