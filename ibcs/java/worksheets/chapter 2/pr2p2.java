public class pr2p2 {
	
	public static void main (String[] args) {
		int num = IBIO.inputInt("input a number: ");

		if(num % 2 == 0) {	
			System.out.println(num + " is even!");
		}	
		
		if(num % 2 != 0) {	
			System.out.println(num + " is odd.");
		}	
	}
}

