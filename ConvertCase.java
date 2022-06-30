//Program which accepts on character from user and
//convert case of that character
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class ConvertCase
{
    public static void main(String arg[])
    {
        ConvertXCase cobj = new ConvertXCase();
        cobj.Accept();
        cobj.ConvertDisplay();
    }
}
////////////////////////////////////////////
class ConvertXCase
{
    private char ch;

    ConvertXCase()
    {
        ch ='\0';
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        ch = sboj.next().charAt();
    }
    public void ConvertDisplay()
    {
         if((ch>=65)&&(ch<=90))
         {
            ch = ch+32;
            System.out.println(+this.ch);
         }
         else
         {
            ch = ch-32;
            System.out.println(+this.ch);
         }
    }
}

