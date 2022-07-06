import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.Files;

class FileSize
{
    public static void main(String a[]){
    
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Directory :");
        String mypath = sobj.nextLine();

        DisplayS(mypath);

//             File[] file = new File(mypath).listFiles();
//             DisplayS(file,mypath);

    }
    public static void DisplayS(String mypath){

        try{
            File[] files = new File(mypath).listFiles();
            for(File filename : files)        //updating or iterating the value of file
            {
                if(filename.isDirectory()){
                    System.out.println("Directory : "+filename.getName());
                    DisplayS(mypath);            //recursion
                }
                else{
                    Path path = Paths.get(mypath+'\\'+filename.getName());        //updating path on each time when we change file
                    long bytes = Files.size(path);
                    System.out.println("Files : "+filename.getName()+" "+bytes);            //back track
                }
             }

        }
        catch(Exception e){
        }
    }

    //this is helpfull when directory doesnot contain any sub directory
//     public static void DisplayS(File[] files,String mypath)
//     {
//         try
//         {
//             for(File filename : files)
//             {
//                     if(filename.isFile())
//                     {
//                         Path path = Paths.get(mypath+"\\"+filename.getName());
//                         long bytes = Files.size(path);
//                         System.out.println("Files : "+filename.getName()+" "+bytes);
//                     }
//             }
//         }
//         catch(Exception e){}
//     }
    
}