import java.lang.*;
import java.util.*;
import java.io.*;

class CreateFile
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File name :");
        String FileName = sobj.nextLine();
        System.out.println("Enter Directory :");
        String FPath = sobj.nextLine();

        createXFile(FPath,FileName);
    }
//creating file using File class and using method createNewFile() that returns boolean vlaue
    public static void createXFile(String FPath,String FileName)
    {
            try
            {
                File DemoFile = new File(FPath,FileName);
                boolean flag = DemoFile.createNewFile();
                if(flag){
                    System.out.println("File is successfuly created.");
                }
                else
                {
                    System.out.println("!!!!");
                }
            }
            catch(Exception x)
            {
                System.out.println("Exception occured");
            }

    }
}