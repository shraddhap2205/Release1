package Java.Fundamental;
 
public class MyChaining {
     
    public MyChaining(){
        System.out.println("In default constructor...");
    }
    public MyChaining(int z){
        this();
        System.out.println("In single parameter constructor...");
    }
    public MyChaining(int a,int b){
        this(b);
        System.out.print(a+" "+b);
        System.out.println("In double parameter constructor...");
    }
    public MyChaining(int i,int j,int x){
        this(i,j);
        System.out.println("In third parameter constructor...");
    }
    public static void main(String a[]){
        MyChaining ch = new MyChaining(10,20,30);
    }
}