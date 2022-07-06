import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.stream.Stream;
import java.nio.file.Files;


class TravelDir
{
    public static void main(String a[]){
    
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Directory :");
        String FPath = sobj.nextLine();

        Path mypath = Paths.get(FPath);
        fileTav(mypath);

        File[] files = new File(FPath).listFiles();
        display(files);
    }
//it display path of that file
//output :  C:\Users\Abhishek Jain\Desktop\LB\Java\Assignments\Assignment42\Directory
//          C:\Users\Abhishek Jain\Desktop\LB\Java\Assignments\Assignment42\Directory\Demo.text
//          C:\Users\Abhishek Jain\Desktop\LB\Java\Assignments\Assignment42\Directory\LB.text
//          C:\Users\Abhishek Jain\Desktop\LB\Java\Assignments\Assignment42\Directory\MyDoc.text
//          C:\Users\Abhishek Jain\Desktop\LB\Java\Assignments\Assignment42\Directory\PPA.text
    public static void fileTav(Path mypath)
    {
        try{
            Stream<Path> filepath = Files.walk(mypath);
            filepath.forEach(System.out::println);
        }
        catch(Exception e){
        }
    }
//it display file names present in that files
//in shot it only gives us only name and above function gives us path from c:\......
//output : Files : Demo.text
//         Files : LB.text
//         Files : MyDoc.text
//         Files : PPA.text
    public static void display(File[] files)
    {
        try{
            for(File filename : files){
                    System.out.println(filename.getName());
            }
        }
        catch(Exception e){}
    }
}