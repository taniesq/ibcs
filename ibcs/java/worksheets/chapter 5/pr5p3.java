public class pr5p3 {
	
	public static void main (String[] args) {
		double sum = 0;
		double a = 1;
		double term = 0;
		int sign = 1;

		for (int i = 1; i <= 10000; i++) {
			term = sign / a;
			sum = sum + term;
			a = a + 2;
			sign = sign * -1;
			
		}
		
		System.out.println("the value of pi is " + (sum * 4));
	}
}

