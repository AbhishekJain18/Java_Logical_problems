import java.lang.*;
import java.util.*;

class Que_3
{
    public static void main(String a[])
    {
        CountCapital obj = new CountCapital();
        Scanner sobj = new Scanner(System.in);
   
        int iCount = 0;
        System.out.println("Enter size of array : ");
        int Size = sobj.nextInt();
        char Arr[] = new char[Size];
        System.out.println("Enter elements in Array : ");

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.next().charAt(0);
        }
        iCount = obj.countCap(Arr);
        System.out.println(iCount);
    }
}

class CountCapital
{
    public int countCap(char Arr[])
    {
        int iCnt = 0;
        for(int i = 0; i < Arr.length; i++)
        {
            if(Character.isUpperCase(Arr[i]))
                iCnt++;
        }
        return iCnt;
    }
}