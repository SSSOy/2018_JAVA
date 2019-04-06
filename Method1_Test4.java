class Method1_Test4 {
	public int sum(int x) {
		int sum = 0; 
		for(int i = 1; i <= x; i++) 
			sum += i;
		return(sum);
	}
	public static void main(String ar[]) {
		Method1_Test4 t = new Method1_Test4();
		System.out.println(t.sum(10));
	}
}