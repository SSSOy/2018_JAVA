class Method3_Test3 {
	public int ab() {
		int a = -14;
		if(a < 0)
			a *= -1;
		return(a);
	}
	public static void main(String ar[]) {
		Method3_Test3 t = new Method3_Test3();
		System.out.println(t.ab());
	}
}