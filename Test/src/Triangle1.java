import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
  
  
 * 
 **
 *** 
 **** 
 ***** 
 
 * */

public class Triangle1 {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int no=Integer.parseInt(br.readLine());
		for(int i=1;i<=no;i++){
			
			for(int j=1;j<=i;j++){
				
				System.out.print("*");
				
				
			}
			
			System.out.println("");
		}
		
}
}
