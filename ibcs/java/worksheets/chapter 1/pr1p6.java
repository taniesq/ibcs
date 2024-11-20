public class pr1p6 {
	
	public static void main (String[] args) {
		int first  = IBIO.inputInt("enter the first term of your sequence: ");
		int	second = IBIO.inputInt("enter the second term of your sequence: ");
		int next   = 0;
		
		System.out.println(first);
		System.out.println(second);
		
		for (int i = 1; i < 18; i++) {
			next = first + second;
			System.out.println(next);
			first  = second;
			second = next;
		}		
	}
}

