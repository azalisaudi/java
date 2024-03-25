class Loop {
	public static void main(String[] args) {
		int k = 0;		
		while(k < 5) {
			System.out.println(k);
			k++;
		}
		
		int j = 0, x = 0;
		do {
			x = j*2;
			System.out.println(x);
			++j;
		} while (j < 5);
		
		int y = 0;
		for(int i=0; i < 5; i++) {
			y = i*3;
			System.out.println(y);
		}
	}
}