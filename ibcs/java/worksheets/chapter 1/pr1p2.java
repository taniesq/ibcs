public class pr1p2 {
	
	public static void main (String[] args) {
		int terms = IBIO.inputInt("enter the number of steps: ");
		int uOne = IBIO.inputInt("enter the first term: ");
		int incr = IBIO.inputInt("enter the amount to increase by: ");
		int n = uOne;	
		
		for (int i = 0; i < terms; i++)	{
			IBIO.out(n + " ");
			n = n + incr;	
		}
	}
}

