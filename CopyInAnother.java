import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;

class CopyInAnother
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Parent File name :");
        String FileName1 = sobj.nextLine();
        System.out.println("Enter child file name : ");
        String FileName2 = sobj.nextLine();
        System.out.println("Enter Directory :");
        String FPath = sobj.nextLine();

        CreateFILE(FPath, FileName2);
        copyXText(FPath,FileName1,FileName2);
    }
    public static void CreateFILE(String FPath,String FileName2)
    {
        try
        {
            File fcreate = new File(FileName2);
            boolean chk = fcreate.createNewFile();
        }
        catch(Exception e)
        {
            System.out.println("Exception occured !!!");
        }
    }

    public static void copyXText(String FPath, String FileName1,String FileName2)
    {
        try
        {
            FileReader readData = new FileReader(FPath+"\\"+FileName1);
            BufferedReader br = new BufferedReader(readData);
            FileWriter writeData = new FileWriter(FPath+"\\"+FileName2);
            String Arr;
            while((Arr = br.readLine())!=null)
            {
                writeData.write(Arr);
                writeData.close();
            }
        }
        catch(Exception B)
        {

        }
    }
}