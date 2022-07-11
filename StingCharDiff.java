import java.lang.*;
import java.util.*;

class StingCharDiff
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();
        char ch[] = str.toCharArray();

        int i = 0, iCntS = 0,iCntC = 0;
        for(i = 0; i<ch.length; i++)
        {
            if(ch[i] >= 'a' && ch[i] <= 'z')
            {
                iCntS++;
            }
            if(ch[i] >= 'A' && ch[i] <= 'Z')
            {
                iCntC++;
            }
        }
        int diff = iCntS -iCntC;
        System.out.println("Difference is : "+diff);
    }
}