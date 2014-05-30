import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DuplicateCharacterinString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the character");
	String data=	br.readLine();
	System.out.println("Enter the repeated character");
		char charentered=(char)System.in.read();
		int count=0;
	for(int i=0;i<data.length();i++){
		
	char c=	data.charAt(i);
		if(c==charentered){
			
			count++;
		}
	}
		
	System.out.println(count);
	}

}
