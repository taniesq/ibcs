public class pr1p1 {
	
	public static void main (String[] args) {
		
		int num = IBIO.inputInt("enter a number: ");
		
		for (int i = 0; i < num; i++) {
			int listnum = i + 1;
			System.out.println(listnum + ". what!");
		}
	}
}

/* the expected output is something like
1. Tanisha
2. Tanisha
... */
