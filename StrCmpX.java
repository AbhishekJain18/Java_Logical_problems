import java.lang.*;
import java.util.*;

class StrCmpX
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first String : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter second String : ");
        String str2 = sobj.nextLine();

        System.out.println(str1.equals(str2));
    }
}

