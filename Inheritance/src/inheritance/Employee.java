/*
 * Author: Jigisha Patel
 * Purpose: Academic
 * 
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author jkp
 */
public class Employee extends Person {
    double salary;
    
    Employee(){
        super();
        this.salary = 14;
    }
    
    Employee(String fname, String lname, int age, double pay){
        super(fname,lname,age);
        this.salary = pay;
    }
    
    void read(){
        super.read();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter salary : ");
        this.salary = input.nextDouble();
    }
    
    void display(){
        super.display();
        System.out.println("Salary : " + this.salary);
    }
}
