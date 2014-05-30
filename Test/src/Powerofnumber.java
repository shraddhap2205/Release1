import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Powerofnumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the base number");
		int base=Integer.parseInt(br.readLine());
		System.out.println("Enter the exponent number");
		int exponent=Integer.parseInt(br.readLine());
		int t=1;
		for(int i=1;i<=exponent;i++){
			
			t=t*base;
			
		}
		System.out.println("power \t"+t);
		
	}

}
