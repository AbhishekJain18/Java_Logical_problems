import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.Files;

class DisplayFile
{
    public static void main(String a[]){
    
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Directory :");
        String mypath = sobj.nextLine();

        File[] file = new File(mypath).listFiles();
        display(file);
    }

    public static void display(File[] files)
    {
        try
        {
            for(File filename : files)
            {
                if(filename.isFile())
                {
                    System.out.println(filename.getName());
                }
            }
        }
        catch(Exception e){}
    }
}