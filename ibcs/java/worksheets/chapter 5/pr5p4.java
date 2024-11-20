public class pr5p4 {
	
	public static void main (String[] args) {
		double sum = 0;
		double numer = 1;
		double denom = 1;
		double seq = 1;
		double term = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			term = numer / denom;
			sum = sum + term;
			
			seq = seq + 2;
			numer = numer * i;
			denom = denom * seq;
		
		}
		
		System.out.println(sum * 2);
	}
}

