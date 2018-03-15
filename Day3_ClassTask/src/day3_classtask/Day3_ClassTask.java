package day3_classtask;

import java.util.Scanner;

public class Day3_ClassTask 
{

    
    public static void main(String[] args) 
    {
       Faculty F = new Faculty();
       F.readData();
       F.displayData();
       F.readValues();
       F.displayValues();
       F.setData();
       F.getData();
    }
    
}


interface PInformation
{
     void readData();
     void displayData();
}

interface FInformation
{
     void setData();
     void getData();
}

interface EInformation
{
     void readValues();
     void displayValues();
}




class Person implements PInformation
{
   String Name;
   int Age;
   Scanner input = new Scanner(System.in);

    @Override
    public void readData() 
    {
      System.out.println("Enter Person Full name : ");
      Name = input.nextLine();
       System.out.println("Enter Person age : ");
       Age = input.nextInt();
    }

    @Override
    public void displayData() 
    {
        System.out.println("Person Name : " +Name);
        System.out.println("Person Age : " +Age);
    }
}


/*class Employee implements EInformation
{
   String Type;
   int Salary;
   Scanner input = new Scanner(System.in);

    @Override
    public void readValues() 
    {
      System.out.println("Enter Employee Type : ");
      Type = input.nextLine();
       System.out.println("Enter Employee Salary : ");
       Salary = input.nextInt();
    }

    @Override
    public void displayValues() 
    {
        System.out.println("Employee Type : " +Type);
        System.out.println("Employee Salary : " +Salary);
    }
}*/


class Faculty extends Person implements FInformation,EInformation
{
   String Courses;
   String Type;
   double Salary;
   Scanner input = new Scanner(System.in);

    @Override
    public void setData() 
    {
        System.out.println("Enter Course name : ");
     Courses = input.nextLine();
    }

    @Override
    public void getData() 
    {
        System.out.println("Courses : " +Courses); 
    }

    @Override
    public void readValues() 
    {
        System.out.println("Enter Employee Type : ");
      Type = input.nextLine();
       System.out.println("Enter Employee Salary : ");
       Salary = input.nextInt();
    }

    @Override
    public void displayValues() 
    {
   System.out.println("Employee Type : " +Type);
        System.out.println("Employee Salary : " +Salary);
    }
}
