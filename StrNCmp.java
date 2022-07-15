import java.lang.*;
import java.util.*;

class StrNCmp
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first String : ");
        String str1 = sobj.nextLine();
        char ch1[] = str1.toCharArray();
        System.out.println("Enter second String : ");
        String str2 = sobj.nextLine();
        char ch2[] = str2.toCharArray();
        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        int i = 0;
        for(i = 0; i< iNo; i++)
        {
            if(ch1[i] != ch2[i])
            {
                System.out.println("String are not equal");
                break;
            }
        }
        if(i == iNo)
        {
            System.out.println("String are equal");
        }
    }
}

