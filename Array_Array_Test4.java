//��������, ��������, ������ ��( ����Ʈ c 445�� 12�� )

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
			System.out.println(( i + 1) + "�� ° ������ �� : " + b);
			System.out.println(( i + 1) + "�� ° ������ �� : " + c);
			System.out.println("");
		}
		System.out.println("��� ���� �� : " + sum);
	}
}