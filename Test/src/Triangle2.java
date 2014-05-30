import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Triangle2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int no=Integer.parseInt(br.readLine());
		for(int i=1;i<=no;i++){
			
			for(int j=no;j>=1;j--){
				if(j>i){
				System.out.print(" ");
				}
				else{
					
					System.out.print("*");
					
				}
			}
			
			System.out.println("");
		}
		
}
		
		
	}


