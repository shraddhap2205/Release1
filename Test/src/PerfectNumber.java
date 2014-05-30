public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 6 -1*2*3=6,1+2+3=6
	
		for (int no = 6; no <= 1000; no++) {
			int sum = 0;
			for (int i = 1; i <= no; i++) {

				double res = (double) no / i;

				if (res == Math.ceil(res)) {

					sum = sum + (int) res;

				}

				
			}
			sum = sum - no;
			if (sum == no) {

				System.out.println(no + "\t Perfect number");

			}

		}

	}

}
