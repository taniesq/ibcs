public class pr2p1 {
	
	public static void main (String[] args) {
		int num = IBIO.inputInt("enter a number between fifty and sixty: ");

		if(num < 50) {	
			System.out.println("that number was too small.");
		}
		
		if(num > 60) {	
			System.out.println("that number was too big.");
		}
	}
}

