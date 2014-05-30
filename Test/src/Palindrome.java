import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Palindrome {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the  number");
		int no=Integer.parseInt(br.readLine());
		StringBuffer sb=new StringBuffer(no+"");
		StringBuffer sb1=sb.reverse();
		String sb2=sb1.toString();
		int reverse=Integer.parseInt(sb2);
		if(reverse==no){
			
			System.out.println("It is Palindrome")		;
			
		}
		else{
			
			System.out.println("It is not Palindrome")		;
		}
		
		
		
	}

}
