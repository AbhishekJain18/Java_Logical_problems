//program to write accept one character from user and
//check weather that character is vowel or not (a,e,i,o,u)
import java.lang.*;
import java.util.*;
///////////////////////////////////////////
//                MAIN                   //
///////////////////////////////////////////
class CheckVowel
{
    public static void main(String arg[])
    {
        CheckXVowel cobj = new CheckXVowel();
        boolean bRet = false;

        cobj.Accept();
        bRet = cobj.Check();
        if(bRet==true)
        {
            System.out.println("In is vowel");
        }
        else
        {
            System.out.println("In is not vowel");
        }
    }
}
/////////////////////////////////////////////////////
class CheckXVowel
{
    private char ch;
    CheckXVowel()
    {
        ch ='\0';
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        ch = sobj.next().charAt(0);
    }
    public boolean Check()
    {
        if(ch==97 ||ch==101||ch==105||ch==111||ch==117)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}