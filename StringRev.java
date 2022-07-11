import java.lang.*;
import java.util.*;

class StringRev
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();
        char ch[] = str.toCharArray();

        int i = 0, iCnt = 0;
        char Temp;

        for(i = 0; i< (ch.length/2); i++)
        {
            Temp = ch[i];
            ch[i] = ch[(ch.length-1)-i];
            ch[(ch.length-1)-i] = Temp;
        }
        System.out.println(ch);
    }
}