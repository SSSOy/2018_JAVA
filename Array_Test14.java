class Array_Test14 {
	public static void main(String ar[]) {
		int sum = 0, count = 0;
		int [] a = new int[900];
		for(int i = 0; i < a.length; i++){
			a[ i ] = i + 100;
			if(a[i] % 6 == 0) {
				sum += a[i];
				count++;
			}
		}
		System.out.println("ÇÕ : "+sum);
		System.out.println("°³¼ö : " + count);
	}
}