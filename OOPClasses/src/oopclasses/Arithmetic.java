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
public class Arithmetic {
    
    static int n1;
    final static int n2=10;
//    int addition (int num1, int num2){
//        return num1 + num2;
//    }
//    
//    int addition (int num1, int num2, int num3){
//        return num1 + num2 + num3;
//    }
    
    int addition (int... num){
        
        int sum , i;
        
        for ( i=0, sum=0 ;i<num.length ; sum+=num[i],i++);
        
        return sum;
    }
    
    float addition (float num1, float num2){
        
        //multiplication(10,20);
        
        return num1 + num2;
    }
    
    static int multiplication (int... num){
        int i=0, answer = 1;
        
        for(i=0;i<num.length;i++){
            answer *= num[i];
        }
        System.out.println("Multiplication : " + answer);
        return answer;
    }
    
    //method overloading
}
