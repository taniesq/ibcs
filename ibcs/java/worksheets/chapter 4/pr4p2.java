public class pr4p2 {
	
	public static void main (String[] args) {
		int sum = 0;
		int num = 0;
		int x = 0;
		
		for (int i = 1; i <= 1000; i++) {
			num = i % 3;
			switch (num) {
				case 0:
					x = i * -5;
					break;
				case 1:
					x = i * 7;
					break;
				case 2:
					x = i * 2;
					break;
			}
			sum = sum + x;
		}
		System.out.println(sum);
	}
}

