import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Armstrong {
	public static void main(String[] args) throws IOException {
		//153=1^3+5^3+3^3
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int no=Integer.parseInt(br.readLine());
		int temp=no;
		String s=temp+"";
		int lenth=s.length();
		System.out.println(lenth);
		int sum=0;
		
		while(temp!=0){
		int digit=temp%10;
		sum=sum+(int)Math.pow(digit, lenth);
		temp=temp/10;
		}
		
		if(sum==no){
			
			System.out.println("no is armstrong");
			
			
		}
		else{
			
			System.out.println("no is not armstrong");
			
		}
}
}