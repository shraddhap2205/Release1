package String.function;
 
public class MyStrStartsWith {
 
    public static void main(String a[]){
     
        String str = "This is an example string.";
        System.out.println("Is this string starts with \"This\"? "
                        +str.startsWith("This"));
        
        
        System.out.println("Is this string starts with \"is\"? "
                        +str.startsWith("is"));
        
        
        
        System.out.println("Is this string starts with \"is\" after index 5? "
                        +str.startsWith("is", 5));
    }
}