import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Square1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int no=Integer.parseInt(br.readLine());
for(int i=1;i<=no;i++){
		System.out.print("*");

}
	
System.out.println("");
for(int j=1;j<=no-2;j++){
for(int i=1;i<=no;i++){
	
	if(i==1||i==no){
		
		System.out.print("*");

		
	}
	else{
		System.out.print(" ");
	}
	
	
}

System.out.println("");
}


for(int i=1;i<=no;i++){
	System.out.print("*");

}

	}

}
