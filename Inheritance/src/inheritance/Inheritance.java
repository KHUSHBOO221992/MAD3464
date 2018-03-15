/*
 * Author: Jigisha Patel
 * Purpose: Academic
 * 
 */
package inheritance;

/**
 *
 * @author jkp
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person one = new Person();
        //one.readData();
        //one.displayData();
        
        Person sreejith = new Person("Sreejith","Thrivikraman",10);
        //sreejith.displayData();
        
        Person sreejith2 = new Person(sreejith);
        //sreejith2.displayData();
        
//        Employee e1 = new Employee(1450.87);
//        e1.display();
//        
        Employee E2 = new Employee();
        E2.display();
        
        E2.firstName="JK";
        E2.lastName="JK";
        E2.age=10;
        E2.salary=1000;
        //E2.displayData();
        E2.display();
        
        //method overriding
        Employee E3 = new Employee();
        E3.read();
        E3.display();
        
       
    }
    
}

