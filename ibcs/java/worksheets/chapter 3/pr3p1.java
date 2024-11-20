public class pr3p1 {
	
	public static void main (String[] args) {
		int even;
		do {
			even = IBIO.inputInt("enter an even number between zero and a hundred: ");
		} while (even < 0 || even > 100 || even % 2 != 0);
		System.out.println(even + " suits the requirements!!!! good job :D");
	}
}

// conclusion: PLEASE initialize variables OUTSIDE the loop!
