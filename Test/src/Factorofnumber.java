import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Factorofnumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the  number");
		int no=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=no;i++){
			
			double root=(double )no/i;
			if(root==Math.ceil(root)){
				
				System.out.println("the factor of number is \t"+i);
				
				
			}
			
			
			
		}
		
	}

}
