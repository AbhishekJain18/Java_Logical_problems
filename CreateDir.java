import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;

class CreateDir
{
    public static void main(String a[]){
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Dir name : ");
        String Dname = sobj.nextLine();
        System.out.println("Enter path :");
        String FPath = sobj.nextLine();

        dirXCreate(Dname,FPath);
    }
    public static void dirXCreate(String Dname,String FPath){
        try{
            Path mypath = Paths.get(FPath,Dname);
            Files.createDirectory(mypath);
        }
        catch(Exception e){
        }
    }

}