public class pr3p3 {
	
	public static void main (String[] args) {
		int sum = 0;
		int digit = 0;
		int n = IBIO.inputInt("enter a number: ");

		do {	
			digit = n % 10;
			digit = digit * digit * digit;
			sum = sum + digit;
			n = n / 10;
		} while (n != 0);
		
		System.out.println("the sum of the cubed digits of the number is " + sum);
	}
}

