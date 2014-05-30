import java.util.Arrays;
import java.util.List;


public class ArraytoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]={"java","is","a","Funny","language"};
		List<String> array=Arrays.asList(a);
		System.out.println(array);
		
		//
		 int[] myArr = {2,4,2,4,5,6,3};
	        System.out.println("Array size before copy: "+myArr.length);
	        int[] newArr = Arrays.copyOf(myArr, 10);
	        System.out.println("New array size after copying: "+newArr.length);
	}

}
