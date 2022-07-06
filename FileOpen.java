import java.lang.*;
import java.util.*;
import java.io.*;
import java.awt.Desktop;

class FileOpen
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File name :");
        String FileName = sobj.nextLine();
        System.out.println("Enter Directory :");
        String FPath = sobj.nextLine();
//         using FileReader and BufferedReader class
//         this method reads file by opening a file and then read
//         try
//         {
//             FileReader file = new FileReader(FPath+"\\"+FileName);
//             BufferedReader br = new BufferedReader(file);
//             String Arr;
//             while((Arr = br.readLine())!=null)
//             {
//                 System.out.print(Arr);
//             }
//         }
//         catch(Exception B)
//         {
//             System.out.println("Exception occured");
//         }

        openfile(FileName,FPath);
    }
//  using Desktop class present in awt
// this function opens text editor
    public static void openfile(String FileName, String FPath)
    {
        try
        {
            File file1 = new File(FPath+"\\"+FileName);
            if(!Desktop.isDesktopSupported())
            {
                System.out.println("Not Supported");
                return;
            }
            Desktop ofile = Desktop.getDesktop();
            if(file1.exists())          //method exists return boolean
            {
                ofile.open(file1);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception occured");
        }
    }
}