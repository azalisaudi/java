class Variable {
	public static void main(String[] args) {
		int x, y = 10;
		long z = 100;
		float a;
		double b = 1.2345;
		
		x = 5;
		a = 10.68f;
		
		z += y + x; // z = z + y + x;
		b += a;     // b = b + a;
		
		System.out.println("The value of x is: " + x);
		System.out.println("The value of y is: " + y);
		System.out.println("The value of z is: " + z);

		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);
		
		double c = b;
		String s = String.format("The value of c is: %.2f", c);
		System.out.println(s);
		
		String s2 = String.format("The values of x = %d, a = %.4f, b = %.3f", x, a, b);
		System.out.println(s2);
	}
}