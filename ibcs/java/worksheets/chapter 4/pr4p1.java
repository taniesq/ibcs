public class pr4p1 {
	
	public static void main (String[] args) {
		int NumOne = IBIO.inputInt("enter a number: ");
		int NumTwo = IBIO.inputInt("enter another number: ");
		
		int choice = 0;
		
		do {
			System.out.println("\nenter 1 for addition");
			System.out.println("enter 2 for multiplication");
			System.out.println("enter 3 to quit");
			
			choice = IBIO.inputInt("your choice: ");
			
			switch (choice) {
				case 1:
					int sum = NumOne + NumTwo;
					System.out.println("the sum is " + sum);
					break;
				case 2:
					int product = NumOne*NumTwo;
					System.out.println("the product is " + product);
					break;
				case 3:
					System.out.println("ok.");
					break;
				default:
					System.out.println("enter 1, 2, or 3, please.");
					break;
			}
		} while (choice != 3);
	}
}

