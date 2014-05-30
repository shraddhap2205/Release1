package String.function;
 
public class MyStrSplit {
 
    public static void main(String a[]){
     
        String str = "This program splits a string based on space";
        String[] tokens = str.split(" ");
       for(int i=0;i<tokens.length;i++){
    	  System.out.println(tokens[i]); 
    	   
       }
        
    }
}