//7. ������ �Է¹޾Ƽ� 1���� �Է¹��� ���������� 5�� ����� �� ���
import java.util.*;

class scanner_Test8 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//1��
		int a = 0;	//2��
		for (int i = 5; i <= n; i += 5) {	//3��; 4��; 5��
			a += i;	//6��
		}
		System.out.println("5�� ����� �� : "+ a);
	}
}