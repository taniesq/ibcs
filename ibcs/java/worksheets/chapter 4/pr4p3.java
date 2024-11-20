public class pr4p3 {
	
	public static void main (String[] args) {
		int num = IBIO.inputInt("enter a number less than 1000: ");
		int x;
		int y;
		int sum = 0;
		
		while (num > 1000) {
			System.out.println("out of range");
			num = IBIO.inputInt("enter another number, within the range: ");
		}
		
		mainloop: for (x= 1; x < num; x++) {
			y = 1;
			
			while (y < num) {
				System.out.println("first: " + x + "        second: " + y);
				sum = (x * x) + (y * y);
				
				if (sum == num) {
					System.out.println(x + " " + y);
					break mainloop;
				}
				
				y = y + 1;
			}
			
		}
		
		if (sum != num) {
			System.out.println("not possible.");
		}
	}
}

