public class pr3p4 {
	
	public static void main (String[] args) {
		int steps = 0;
		int next = 0;
		int num = IBIO.inputInt("enter a number: ");

		do {
			if (num % 2 == 0) {
				next = num / 2;
			} else {
				next = num * 3 + 1;
			}
			
			num = next;
			steps++;
			System.out.println(num);
		} while (num != 1);
		
		System.out.println("the number of steps was: " + steps);		
	}
}

