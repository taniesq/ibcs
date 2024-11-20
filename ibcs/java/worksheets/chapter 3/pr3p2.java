public class pr3p2 {
	
	public static void main (String[] args) {
		int i = 1;
		int x = 0;

		do {	
			x = IBIO.inputInt("enter a number that's greater than 1: ");
		} while (x <= 1);
		
		do {	
			i++;
		} while (x % i != 0);
		
		if (x == i) {	
			System.out.println(x + " is a prime number!");
		} else {	
			System.out.println(x + " is divisible by " + i + "!");
		}
	}
}

