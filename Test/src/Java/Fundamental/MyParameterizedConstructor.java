package Java.Fundamental;
public class MyParameterizedConstructor {
     
    private String name;
     
    public MyParameterizedConstructor(String str){
        name = str;
        System.out.println("I am inside parameterized constructor.");
        System.out.println("The parameter value is: "+str);
    }
    public MyParameterizedConstructor(){
       
        System.out.println("I am inside default constructor.");
   
    }
    public static void main(String a[]){
    	//MyParameterizedConstructor v= new MyParameterizedConstructor();
        MyParameterizedConstructor mpc = new MyParameterizedConstructor("Madhu Raj");
    }
}