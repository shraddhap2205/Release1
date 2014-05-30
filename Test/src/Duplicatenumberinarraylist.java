import java.util.ArrayList;
import java.util.List;


public class Duplicatenumberinarraylist {

	public static void findduplicate(List<Integer> numbers){
		
	for(int i=0;i<numbers.size();i++){
		for(int j=i+1;j<numbers.size();j++){
		
			if(numbers.get(i)==numbers.get(j)){
				
				System.out.println("the duplicate no is "+numbers.get(i));
				
				
				
			}
		
		}
		
	}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = new ArrayList<Integer>();
		for(int i=1;i<=10;i++){
			
			numbers.add(i);
			
			
		}
	
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		findduplicate(numbers);
		
	
		
	}

}
