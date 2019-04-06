class Method1_Test2 {
	public void sum(int x) {
		int sum = 0; 
		for(int i = 1; i <= x; i++) 
			sum += i;
		System.out.println(sum);
	}
	public static void main(String ar[]) {
		Method1_Test2 t = new Method1_Test2();
		t.sum(10);
	}
}