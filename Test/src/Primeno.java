
public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int j=1;j<=100;j++){
			
			
			int no=j;
			int count=0;
			
			for(int i=1;i<=no;i++){
				
				if(no%i==0){
					
					count++;
					
				}
				
				
			}
			
			if(count==2){
				
				System.out.println(no+"\t is a prime no");
			}
			
			
		}
		
	}

}
