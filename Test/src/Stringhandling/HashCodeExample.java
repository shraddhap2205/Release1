package Stringhandling;
public class HashCodeExample{
   public static void main(String args[]){
       String str = new String("Welcome!!");
       String str1=new String("Welcome!!");
       System.out.println("Hash Code for String str: "+str.hashCode());	
       System.out.println("Hash Code for String str: "+str1.hashCode());	
       System.out.println("Hash Code for String str: "+str1.equals(str));
   }
}