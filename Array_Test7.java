//5���� ���� �Է¹޾� �� ���ϱ�
import java.util.*;

class Array_Test7 {
	public static void mai��(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int a[ ] = new int[ 5 ];
		int sum = 0;

		for(int i = 0; i < a.length; i++){
			System.out.print("���� �Է� : ");
			a[ i ] = sc.nextInt();
			sum += a[ i ];
		}
		System.out.println("�� : "+ sum);
	}
}