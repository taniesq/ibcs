public class Test1 {
	
	public static void main (String[] args) {
		System.out.println("Tanisha Jain");
		int numfact; // the user input; the number to be factorial'd
		
		do {
			numfact = IBIO.inputInt("enter a number to find the factorial of: ");
			
			if (numfact < 0 || numfact > 20) {
			System.out.println("please enter a positive number less than 20!");
			}
			
		} while (numfact < 0 || numfact > 20);
		
		int c = numfact;
		int fact = numfact;
		
		// if the input is less than 10
		while (numfact < 10) {
			while (c != 0) {
				numfact = numfact * (fact - 1);
				c = c - 1;
				System.out.println(numfact);
			}
		}
		
		// if the input is greater than 10:
		while (numfact > 10) {
			do {
				numfact = numfact * (fact - 1);
				c = c - 1;
			} while (c != 0);
			System.out.println(fact);
		} 
		
		System.out.println(numfact + " has "); // find the number of digits
			int digits = 0;
			do {
				digits++;
				numfact = numfact / 10;
			} while(numfact > 0);
			System.out.print(digits + " digits");
		
	}
}

