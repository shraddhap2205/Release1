import java.io.IOException;

public class Demo
{
   public void throwMethod() throws IOException
   {
       System.out.println ("Inside throwMethod");
       throw new IOException ("Demo"); 
   } 
   
   
  
}