class For_Test7_2 {
	public static void main(String ar[]) {
		int sum = 0;
		int k = 1;
		for (int i = 1; i <=10; i++) {
			sum += (i * k);
			k *= -1;
		}
		System.out.println(sum);
	}
}