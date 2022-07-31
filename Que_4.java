import java.lang.*;
import java.util.*;

class Que_4
{
    public static void main(String a[])
    {
        StudentResult obj = new StudentResult();
        Scanner sobj = new Scanner(System.in);
        float Persentage[];
        System.out.println("Enter number of Students in class : ");
        int iSize = sobj.nextInt();
        Persentage = new float[iSize];
        for(int i = 0; i < Persentage.length; i++)
        {
            System.out.println("Enter persentage of Students of rollno "+(i+1)+" : ");
            Persentage[i] = sobj.nextFloat();
        }

        obj.result(Persentage);
    }
}

class StudentResult
{
    public void result(float Arr[])
    {
        for(int i = 0; i <  Arr.length; i++)
        {
            System.out.print("Result of Student "+(i+1)+" : ");
            if(Arr[i] < 35.0f)
            {
                System.out.println("FAIL");
            }
            else if(Arr[i] >= 35.0f && Arr[i] < 50.0f)
            {
                System.out.println("PASS Class");
            }
            else if(Arr[i] >= 50.0f && Arr[i] < 60.0f)
            {
                System.out.println("Second PASS Class");
            }
            else if(Arr[i] >= 60.0f && Arr[i] < 70.0f)
            {
                System.out.println("First PASS Class");
            }
            else
            {
                System.out.println("First class with Distinction");
            }
        }
    }
}