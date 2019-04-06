class Method1_Test1 {
	public void sum() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) 
			sum += i;
		System.out.println(sum);
	}
	public static void main(String ar[]) {
		Method1_Test1 t = new Method1_Test1();
		t.sum();
	}
}