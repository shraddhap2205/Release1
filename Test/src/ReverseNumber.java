import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReverseNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the  number");
		int no=Integer.parseInt(br.readLine());
	
		int temp=no;
		int digit=0;
		int sum=0;
		while(temp!=0){

			digit=temp%10;
			System.out.print(digit);
			temp=temp/10;
			sum=sum+digit;
			
			
			
		}
		System.out.println("\n"+sum);
	}

}
