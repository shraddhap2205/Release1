
public class DeadLock {

		String s1="java";
		String s2="unix";
		
		Thread t1=new Thread("My thread1"){
		public void run()
		{
			while(true)
			{	
				synchronized(s1)
				{		
					synchronized(s2)
					{
						System.out.println(s1 + s2);
					}
				}
				
			}
		}
		};
			
		
		Thread t2=new Thread("My thread2"){
		public void run()
		{
			while(true)
			{	
				synchronized(s1)
				{		
					synchronized(s2)
					{
						System.out.println(s1 + s2);
					}
				}
				
			}
		}
		};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  DeadLock mdl = new DeadLock();
	        mdl.t1.start();
	        mdl.t2.start();
	}

}
