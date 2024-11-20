public class pr2p8 {
	
	public static void main (String[] args) {
		int c = 0;

		for (int i = 1; i <= 1000000; i++) {
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)
			{
				c++;
				// what happened to c = c + 1;-;
			}
		}
		System.out.println(c);
	}
}

