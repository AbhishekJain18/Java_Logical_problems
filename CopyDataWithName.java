import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.Files;

class CopyDataWithName
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
//             File nfile = new File(FPath+"\\"+FName);
//             nfile.createNewFile();
//             FileWriter fw = new FileWriter(nfile,true);
//             BufferedWriter bw = new BufferedWriter(fw);
//
//             for(int i = 0; i< filename.length; i++)
//             {
//                 if(filename[i].isFile())
//                 {
//                     String fn = filename[i].getName();
//                     bw.write(fn);
//                     bw.write("\n");
//
//                     FileReader fr = new FileReader(filename[i]);
//                     BufferedReader br = new BufferedReader(fr);
//                     String data;
//                         while((data = br.readLine())!= null)
//                         {
//                             bw.write(data);
//                         }
//                     bw.write("\n");
//                 }
//             bw.close();


                File nFile = new File(FPath+"\\"+FName);
                nFile.createNewFile();
                FileWriter fwriter = new FileWriter(nFile,true);
                for(File FileName : filename)
                {
                    if(FileName.isFile())
                    {
                        String fn = FileName.getName();
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