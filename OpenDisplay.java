import java.lang.*;
import java.util.*;
import java.io.*;

class OpenDisplay
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File name :");
        String FileName = sobj.nextLine();
        System.out.println("Enter Directory :");
        String FPath = sobj.nextLine();


        openfile(FileName,FPath);
    }
//         using FileReader and BufferedReader class
//         this method reads file by opening a file and then read
        public static void openfile(String FileName, String FPath)
        {
            try
            {
                FileReader file = new FileReader(FPath+"\\"+FileName);
                BufferedReader br = new BufferedReader(file);
                String Arr;
                while((Arr = br.readLine())!=null)
                {
                    System.out.print(Arr);
                }
            }
            catch(Exception B)
            {
                System.out.println("Exception occured");
            }
        }
}