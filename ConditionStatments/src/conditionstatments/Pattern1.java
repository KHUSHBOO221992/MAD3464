/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionstatments;

/**
 *
 * @author macstudent
 */
public class Pattern1 {
    public static void main(String[] args) {
    int n = 5;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n;j++)
      {
      if((j==1 || j==n) || (i==1 || i==n))
      {
         System.out.print(" *");//1 space
      }else
      {
          System.out.print("  ");//2 spaces
      }
      }
      System.out.println();
    }
}
    
}
