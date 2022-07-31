import java.lang.*;
import java.util.*;

class Que_2
{
    public static void main(String a[])
    {
        SumEleOfArray obj = new SumEleOfArray();
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

        UpdatedArray = obj.sumDigitofArray(Arr);
        for(int i = 0; i < UpdatedArray.length; i++)
        {
            System.out.print(UpdatedArray[i]+" ");
        }
    }
}

class SumEleOfArray
{
    public int ArrNEW[];
    public int[] sumDigitofArray(int Arr[])
    {
        ArrNEW = new int[Arr.length];
        for (int i = 0; i < Arr.length ; i++)
        {
            ArrNEW[i] = SumELement(Arr[i]);
        }
        return ArrNEW;
    }
    public int SumELement(int iNo)
    {
        int Sum = 0;
        while(iNo != 0)
        {
            Sum += (iNo % 10);
            iNo = iNo / 10;
        }
        return Sum;
    }
}