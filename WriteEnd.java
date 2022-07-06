import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.Charset;

class WriteEnd
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File name :");
        String FileName = sobj.nextLine();
        System.out.println("Enter Directory :");
        String FPath = sobj.nextLine();
        System.out.println("Enter data :");
        String data = sobj.nextLine();


        writeX(FileName,FPath,data);
        writeXX(FileName,FPath,data);
    }
//         using FileReader and BufferedReader class
//         this method reads file by opening a file and then read
    public static void writeX(String FileName, String FPath, String data)
    {
        try
        {
            File file = new File(FPath+"\\"+FileName);
            FileWriter fr = new FileWriter(file,true);

            fr.write(data);
            fr.close();
        }
        catch(Exception B)
        {
            System.out.println("Exception occured");
        }
    }
//      using Files class present in nio and method write
    public static void writeXX(String FileName, String FPath, String data)
    {
        try
        {
            Path mypath = Paths.get(FPath,FileName);
            Charset ch = Charset.forName("UTF-8");
            ArrayList<String> lines = new ArrayList<>();
            lines.add(data);
//                path of file, arraylist(data), charater standered set, opening in indirectly in write mode(using Std open option)
            Files.write(mypath,lines,ch,StandardOpenOption.APPEND);

        }
        catch(Exception e)
        {
            System.out.println("Exception occured");
        }
    }
}