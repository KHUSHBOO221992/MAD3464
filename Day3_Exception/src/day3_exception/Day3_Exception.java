package day3_exception;

public class Day3_Exception 
{
    public static void main(String[] args) 
    {
        
        int n1 = 10, n2 = 3;
        int ar1[] = {10, 20, 30};
        
        try
        {
            if(n2 == 0)
            {
                throw new ArithmeticException();
            }
            else
            {
               n1 = n1 / n2; 
            }
            
            n2 = ar1[4];
            System.out.println("Value of N2:" + n2);
        
        }
        catch(ArithmeticException e)
        {
            System.out.println("UNABLE TO DEVIDE BY ZERO.");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ARRAY ELEMENT UNAVAILABLE.");
        }
        catch(Exception e)
        {
            System.out.println("SOMETHING WRONG.");
        }
        finally
                {
                   System.out.println("Value of N:" + n1); 
                }
    }
    
}
