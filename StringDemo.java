import java.lang.*;
import java.util.*;

class StringDemo
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
            if(ch[i] >= 'A' && ch[i] <= 'Z')
            {
                iCnt++;
            }
        }
        System.out.println("Frequency Capital chataters in String are : "+iCnt);
    }
}