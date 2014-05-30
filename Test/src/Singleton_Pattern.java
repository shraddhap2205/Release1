
public class Singleton_Pattern {

	private Singleton_Pattern(){
		
	}
	
	public static Singleton_Pattern getinstance(){
		
		Singleton_Pattern sp=new Singleton_Pattern();
		return sp;
		
		
	}
	
	public void testme(){
		
		System.out.println("Print me");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton_Pattern sv=getinstance();
		sv.testme();
		
		
	}

}
