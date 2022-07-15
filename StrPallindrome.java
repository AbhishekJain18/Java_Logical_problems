import java.lang.*;
import java.util.*;

class StrPallindrome
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter second String : ");
        String str = sobj.nextLine();

        int i = 0, k = 0;
        boolean bret = false;
        for(i = 0, k = str.length()-1; i<(str.length()/2); i++, k--)
        {
            if(str.charAt(i) == str.charAt(k) || str.charAt(i) == Character.toUpperCase(str.charAt(k))|| str.charAt(i) == Character.toLowerCase(str.charAt(k)) )
            {
                bret = true;
            }
            else
            {
                bret = false;
            }
        }
        if(bret)
        {
            System.out.println("String Pallindrome");
        }
        else
        {
            System.out.println("Stirng not Pallindrome");
        }
    }

}

