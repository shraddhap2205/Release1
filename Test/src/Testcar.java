
public class Testcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c=new Car();
Street s=new Street();
Street s2=c.s1;
s2=s;

s2.streetname="alpha";
s2.getname();
	}

}
