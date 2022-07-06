import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.Files;

class CopyDataWithNameSize
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

    public static void allFileX(File[] filename, String FPath, String FName)
    {
        try
        {
                File nFile = new File(FPath+"\\"+FName);
                nFile.createNewFile();
                FileWriter fwriter = new FileWriter(nFile,true);
                for(File FileName : filename)
                {
                    if(FileName.isFile())
                    {
                        String fn = FileName.getName()+" : "+FileName.length();
                        fwriter.write(fn);
                        fwriter.write("\n");
                        
                        FileReader freader = new FileReader(FileName);
                        BufferedReader br = new BufferedReader(freader);
                        String Data;
                        while((Data = br.readLine()) != null)
                        {
                            fwriter.write(Data);
                        }
                        fwriter.write("\n");
                    }
                }
                fwriter.close();
        }
        catch(Exception e){}
    }
}