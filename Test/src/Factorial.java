import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Factorial {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int no=Integer.parseInt(br.readLine());
		int prod=1;
		for(int i=1;i<=no;i++){
			
			prod=prod*i;
			
		
			
		}
		System.out.println("The factorial of "+no+"--"+prod);
		
	}

}
