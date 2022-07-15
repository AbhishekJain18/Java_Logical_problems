import java.lang.*;
import java.util.*;

class Pattern14
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();
        char ch[] = str.toCharArray();
        int i = 0, j = 0;
        for(i = str.length()-1; i > 0; i--)
        {
            for(j = 0; j <= i; j++)
            {
                System.out.print(ch[j]+" ");
            }
            System.out.println();
        }
        for(i = 0; i < str.length(); i++)
        {
            for(j = 0; j <= i; j++)
            {
                System.out.print(ch[j]+" ");
            }
            System.out.println();
        }

    }
}

