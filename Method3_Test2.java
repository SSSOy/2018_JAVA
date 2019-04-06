class Method3_Test2 {
	public void ab(int x) {
		if(x < 0)
			x *= -1;
		System.out.println(x);
	}
	public static void main(String ar[]) {
		Method3_Test2 t = new Method3_Test2();
		t.ab(63);
	}
}