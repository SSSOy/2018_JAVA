//2. ����, ����, ���� ���� �Է¹޾� ����, ��� ���
import java.util.*;

class scanner_Test3 {
	public static void main(String ar[]) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int ma = sc.nextInt();
		int eng = sc.nextInt();
		a = kor + ma + eng;
		b = a / 3;
		System.out.println("�� ���� ������ �� : " + a);
		System.out.println("��� : " + b);
	}
}