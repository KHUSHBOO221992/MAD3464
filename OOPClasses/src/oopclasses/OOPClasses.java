/*
 * Author: Jigisha Patel
 * Purpose: Academic
 * 
 */
package oopclasses;

import java.util.Scanner;

/**
 *
 * @author jkp
 */
public class OOPClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a new object of BAnk class
        Bank myBank = new Bank();
        
        System.out.println("Bank ID : " + myBank.bankID);
        System.out.println("Bank Name : " + myBank.bankName);
        
        Bank yourBank = new Bank();
        
        myBank.bankID = 1231;
        myBank.bankName = "RBC";
        
        System.out.println("Bank ID : " + myBank.bankID);
        System.out.println("Bank Name : " + myBank.bankName);
        
        
        myBank.getBankName();
        
        yourBank.setBankName("ICICI");
        yourBank.getBankName();
        
        Scanner myInput = new Scanner(System.in);
        String name;
        
        System.out.println("Enter bank Name : ");
        name = myInput.nextLine();
        
        yourBank.setBankName(name);
        yourBank.getBankName();
        
        
        //create object Arithmetic class
        Arithmetic operation1 = new Arithmetic();
        
        System.out.println("Output of integer addition : " + operation1.addition(10, 20));
        
        System.out.println("Output of float addition : " + operation1.addition(10.23f, 20.23f));
        
        System.out.println("Output of three integer addition : " + operation1.addition(10,20,30));
        
        System.out.println("Output of multiplication : " + operation1.multiplication(10,20,30));
        
        
        Arithmetic.multiplication(10,20);
        //Arithmetic.addition(10,20);
        
        Arithmetic.n1 = 20;
        //Arithmetic.n2 = 20;
        System.out.println(Arithmetic.n1 + " " + Arithmetic.n2);
    }
    
}


