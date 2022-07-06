import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.Files;

class FileName
{
    public static void main(String a[]){
    
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter FileName that you want to create :");
        String FName = sobj.nextLine();

        System.out.println("Enter new Directory :");
        String FPath = sobj.nextLine();

        System.out.println("Enter scan Directory :");
        String mypath = sobj.nextLine();

        File[] file = new File(mypath).listFiles();
        allFileX(file,FPath,FName);
    }

    public static void allFileX(File[] files, String FPath, String FName)
    {
        try
        {
            File file = new File(FPath+"\\"+FName);
            file.createNewFile();
            for(File filename : files)          //for(int i = 0; i< files.lenght; i++)
            {
                if(filename.isFile())
                {
                    String Arr = filename.getName();
                    FileWriter fr = new FileWriter(file,true);

                    fr.write(Arr);
                    fr.write("\n");
                    fr.close();
                }
            }
        }
        catch(Exception e){}
    }
}