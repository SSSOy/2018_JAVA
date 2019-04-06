class Switch_Test{

	public static void main(String ar[]) {
		int a = 10;
		int b = 20;
		char c = '*';
		switch(c) {
			case '+' : System.out.println(a + b);
						break;
			case '-' : System.out.println(a - b);
						break;
			case '*' : System.out.println(a * b);
						break;
			default : System.out.println(a / b);
						break;
		}
	}
}