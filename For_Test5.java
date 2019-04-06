class For_Test5 {
	public static void main(String ar[]) {
		int sum = 0;
		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 2 ==1){
				sum += i;
			}
			else{
				sum2 += i;
			}
		}
		System.out.println("Â¦¼öÀÇ ÇÕ : "+sum);
		System.out.println("È¦¼öÀÇÇÕ : "+sum2);
	}
}