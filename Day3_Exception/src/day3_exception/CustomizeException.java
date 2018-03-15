package day3_exception;

class testException extends Exception
{
    public testException(String message)
    {
        super(message);
    }
}
public class CustomizeException 
{
         public static void main(String args[])  throws Exception   //throws always we use with methods
         {
             int n1 = 10;
             
             try
             {
                 if(n1 == 10)
                 {
                     throw new testException("TEST UNSUCCESSFUL");   //throw is used to explicitly generates exception
                 }
             }
             catch(testException e)
             {
                 System.out.println("CUSTOMIZE EXCEPTION");
                 System.out.println(e.getMessage());       //either use this one or next one to get msz
                 System.out.println(e.getStackTrace());    //getstacktrace works with hierachy of methods to find where exception is generated
             }
         }
}
