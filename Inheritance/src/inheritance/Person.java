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
 public class Person {
 //final public class Person {
    String firstName;
    String lastName;
    int age;
    
    //default constructor
    Person(){
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 1;
    }
    
    //parameterized constructor
    Person(String fNm, String lNm, int age){
        this.firstName = fNm;
        this.lastName = lNm;
        this.age = age;
    }
    
    //copy constructor
    Person(Person object){
        this.firstName = object.firstName;
        this.lastName = object.lastName;
        this.age = object.age;
    }
    
    void read(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first name : ");
        this.firstName = input.nextLine();
        
        System.out.println("Enter last name : ");
        this.lastName = input.nextLine();
        
        System.out.println("Enter age : ");
        this.age = input.nextInt();
    }
    
    void display(){
        System.out.println("First Name : " + this.firstName);
        System.out.println("Last Name : " + this.lastName);
        System.out.println("Age : " + this.age);
    }
}
