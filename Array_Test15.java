class Array_Test15 {
	public static  void main(String ar[]) {
		int [] a = new int[30];
		int [] sum = new int[2];
		for(int i = 0; i < a.length; i++) {
			a[ i ] = i + 1;
			if(a[ i ] % 2 == 0) 
				sum[0] += a[ i ];
			else
				sum[1] += a[ i ];
		}
		System.out.println("Â¦¼öÀÇ ÇÕ : " + sum[ 0 ]);
		System.out.println("È¦¼öÀÇ ÇÕ : " + sum[ 1 ]);
	}
}