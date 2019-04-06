//가로의합, 세로의합, 모든수의 합( 퍼펙트 c 445쪽 12번 )

class Array_Array_Test4 {
	public static void main(String ar[]) {
		int a[ ][ ] = { {78, 48, 78, 98},{99, 92, 83, 29},{29, 64, 83, 89},{34, 78, 92, 56} };
		int sum = 0;

		for (int i = 0; i < 4; i++) {
			int b = 0;
			int c = 0;
			for (int j = 0; j < 4; j++) {
				b += a[i][j];
				c += a[j][i];
				sum += a[i][j];
			}
			System.out.println(( i + 1) + "번 째 가로의 합 : " + b);
			System.out.println(( i + 1) + "번 째 세로의 합 : " + c);
			System.out.println("");
		}
		System.out.println("모든 수의 합 : " + sum);
	}
}