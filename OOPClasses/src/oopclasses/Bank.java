/*
 * Author: Jigisha Patel
 * Purpose: Academic
 * 
 */
package oopclasses;

/**
 *
 * @author jkp
 */
public class Bank {
    int bankID = 10102;
    String bankName = "TD";
    
    void getBankName(){
        System.out.println("Bank Name : " + this.bankName);
    }
    
    void setBankName(String name){
        this.bankName = name;
    }
}
