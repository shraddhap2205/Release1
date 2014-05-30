package Stringhandling;
public class StartsWithExample{
   public static void main(String args[]) {
       String str= new String("quick brown fox jumps over the lazy dog");
       System.out.println("String str starts with quick: "+str.startsWith("quick"));
       System.out.println("String str starts with brown: "+str.startsWith("brown"));
       System.out.println("substring of str(starting from 6th index) has brown prefix: "
+str.startsWith("brown", 6));
       System.out.println("substring of str(starting from 6th index) has quick prefix: "
+str.startsWith("quick", 6));

   }
}