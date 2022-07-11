import java.lang.*;
import java.util.*;

class StringChkVowel
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();
        char ch[] = str.toCharArray();

        int i = 0, iCnt = 0;
        for(i = 0; i<ch.length; i++)
        {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
            {
                break;
            }

        }
        if(i == ch.length)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println("True");
        }
    }
}