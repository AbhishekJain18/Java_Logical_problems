import java.lang.*;
import java.util.*;

class StrRevTog
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        char ch;
        String strRev = "";

        int i = 0;
        for(i = 0; i< str.length(); i++)
        {
            ch = str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                strRev = (Character.toLowerCase(ch))+strRev;
            }
            else if(Character.isLowerCase(ch))
            {
                strRev = (Character.toUpperCase(ch))+strRev;
            }
            else
            {
                strRev = ch + strRev;
            }
        }
        System.out.println("Toggel string is : "+strRev);

    }
}

