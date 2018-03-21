
package test2;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Encry3 
{
    public static void main(String[] args)
    {
        String str1 = "ZANIL";
 
        StringBuilder input1 = new StringBuilder();
 
       
        input1.append(str1);
 
        
        input1 = input1.reverse();
 
        
        System.out.println(input1);
       
        str1=str1.concat (""+input1); // comcate two string
        System.out.println(str1);
        System.out.println(str1.length());
    }
}
