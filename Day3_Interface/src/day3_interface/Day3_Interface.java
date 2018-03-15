/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3_interface;

/**
 *
 * @author macstudent
 */
public class Day3_Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Addition op1 = new Addition();
       op1.display();
       
       counting cn1 = new counting();
       cn1.display();
       
       A a1 = new A();
       a1.display();
       a1.calcMultiplication();
       
       B b1 = new B();
       b1.display();
       b1.calcMultiplication();
       b1.calcdivision();
    }
    
}
interface Arithmetic
{
    int n1 = 20;
    int n2 = 30;
    void display();
}
class Addition implements Arithmetic
{
        @Override
        public void display()
        {
                System.out.println("Inside Addition Class");            
                System.out.println(n1 + "+" + n2 + " = " + (n1+n2));
        }
}

class counting extends Addition
{
    
    
}
 interface multiplication extends Arithmetic
 {
      void calcMultiplication();
 }

class A implements multiplication
{
    @Override
        public void display()
        {
            System.out.println("INSIDE CLASS A");
                System.out.println(" n1 = " + n1 + " n2 = " + n2);
        }
    

    @Override
    public void calcMultiplication() {
       System.out.println(" MULTIPLICATION :" + (n1*n2));
    }
}

interface division extends Arithmetic
{
    void calcdivision();
}

class B implements division, multiplication
{
    
    @Override
    public void calcdivision()
    {
        System.out.println(" DIVISION :" + (n1/n2));
    }
    @Override
        public void display()
        {
            System.out.println("INSIDE CLASS B");
                System.out.println(" n1 = " + n1 + " n2 = " + n2);
        }
    
  @Override 
        public void calcMultiplication()
    {
        System.out.println(" MULTIPLICATION :" + (n1*n2));
    }
}

class C extends B
{
    int c1 = 20;
}
