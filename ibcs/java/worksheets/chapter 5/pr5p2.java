public class pr5p2 {
	
	public static void main (String[] args) {
		double sum = 0;
		double x;

		for (int i = 1; i <= 100; i++) {
			x = i * i;
			sum = sum + (1 / x);
		}
		
		System.out.println("the total is " + sum);
	}
}

