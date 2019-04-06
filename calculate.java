class calculate {

	public int Add(int x, int y){
		return (x + y);
	}
	public int Sub(int x, int y){
		return (x - y);
	}
	public int Mul(int x, int y){
		return (x * y);
	}
	public float Div(float x, float y) {
		return (x / y);
	}

	public static void main(String ar[]) {
		calculate c = new calculate();
		System.out.println(c.Add(5, 3));
		System.out.println(c.Sub(5, 3));
		System.out.println(c.Mul(5, 3));
		System.out.println(c.Div(5, 3));
	}
}