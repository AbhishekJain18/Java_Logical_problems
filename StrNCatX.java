import java.lang.*;
import java.util.*;

class StrNCatX
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first String : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter second String : ");
        String str2 = sobj.nextLine();

        System.out.println("Enter Number : ");
        int iNo = sobj.nextInt();
        String strCon = "";
        if(str2.length() > iNo)
        {
            strCon = str1 +(String.valueOf(str2.toCharArray(), 0, iNo));
        }
        else
        {
            strCon = str1 +(String.valueOf(str2.toCharArray(), 0, str2.length()));
        }
        System.out.println(strCon);
    }
}

