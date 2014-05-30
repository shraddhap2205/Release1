package String.function;
 
public class MyStringInitialization {
    public static void main(String a[]){
        String abc = "This is a string object";
        String bcd = new String("this is also string object"); 
        char[] c = {'a','b','c','d'};
        String cdf = new String(c);
        System.out.println(c);
        String junk = abc+" This is another String object";
        System.out.println(junk);
    }
}