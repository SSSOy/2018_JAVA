class Method3_Test4 {
	public int ab(int x) {
		if(x < 0)
			x *= -1;
		return(x);
	}
	public static void main(String ar[]) {
		Method3_Test4 t = new Method3_Test4();
		System.out.println(t.ab(-352));
	}
}