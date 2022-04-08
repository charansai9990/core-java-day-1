package Problem_Statement_7_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentDemo
{
     public static void main(String args[])throws Exception
     {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

          System.out.print("Enter roll number: ");
          int roll = Integer.parseInt(br.readLine());
          System.out.print("\nEnter name: ");
          String name = br.readLine();
          System.out.print("\nEnter age: ");
          int age = Integer.parseInt(br.readLine());
          System.out.print("\nEnter course: ");
          String course = br.readLine();
          Student s = new Student(roll,name,age,course);
          s.display();
     }
}

