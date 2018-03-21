
package test2;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.T;


public class Encry2 
{
     Scanner scan    =   new Scanner(System.in);
    int T   =   scan.nextInt();
    

    for(int i=0 ; i<T ; i++)
    {
        String  myString    =   scan.nextLine();

        int evn =   0,
            odd =   0,
            len =   myString.length();

        char    strE[]  =   new char[50],
                strO[]  =   new char[50];

        for(int j=0 ; j<len ; j++)
        {
            if(j%2 == 0)
            {
                strE[evn]   =   myString.charAt(j);
                evn++;
            }
            if(j%2 == 1)
            {
                strO[odd]   =   myString.charAt(j);
                odd++;
            }
        }
        System.out.print(strE);
        System.out.print(" ");
        System.out.println(strO);
    }
}
