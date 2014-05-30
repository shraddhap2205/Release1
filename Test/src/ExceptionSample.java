public class ExceptionSample
{
    public static void main(String args[]) throws Exception
    {
        ExceptionSample es = new ExceptionSample();
        es.displayMymsg();
    }
    public void displayMymsg() throws MyException
    { 
        for(int j=8;j>0;j--)
        {
          System.out.println("j= "+j);
          if(j==7)
          {
              throw new MyException("This is my own Custom Message");
          }
        }
    }
}