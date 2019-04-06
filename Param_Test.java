class Param_Test {
	public static void main(String ar[]){
		int a[ ] = new int[3];
		int sum = 0;

		System.out.println(ar[ 0 ]);
		System.out.println(ar[ 1 ]);
		System.out.println(ar[ 2 ]);

		System.out.println(ar[0] + ar[1] + ar[2]);
		System.out.println("배열의 크기 : "+ ar.length);

		for(int i = 0; i < a.length; i++){
			a[ i ] = Integer.parseInt(ar[i]);
			sum += a[ i ];
		}
		System.out.println(sum);
	}
}