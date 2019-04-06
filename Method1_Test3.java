class Method1_Test3 {
	public int sum() {
		int sum = 0; 
		for(int i = 1; i <= 10; i++) 
			sum += i;
		return(sum);
	}
	public static void main(String ar[]) {
		Method1_Test3 t = new Method1_Test3();
		System.out.println(t.sum());
	}
}