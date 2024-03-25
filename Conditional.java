class Conditional {
	public static void main(String[] args) {
		int x = 0;
		
		if(x < 0) {
			System.out.println("NEGATIVE");
		} else if (x > 0){
			System.out.println("POSITIVE");
		} else {
			System.out.println("ZERO");
		}
		
		x = 15;
		if(x < 0) {
			System.out.println("NEGATIVE");
		} else if(x >= 0 && x <= 10) {
			System.out.println("BETWEEN 0 AND 10");
		} else if(x > 11 && x <= 20) {
			System.out.println("BETWEEN 11 AND 20");
		} else {
			System.out.println("GREATER THAN 20");
		}
		
		x = 32;
		switch(x) {
			case 10: System.out.println("TEN"); break;
			case 15: System.out.println("FIFTEEN"); break;
			case 20: System.out.println("TWEENTY"); break;
			default:
				System.out.println("OTHER THAN 10, 15, 20");
		}
		
		int y = 10, z = 20;
		if(y == 10 || z == 25) {
			System.out.println("TRUE");
		} else
			System.out.println("FALSE");
		
	}
}