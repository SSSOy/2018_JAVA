//5. �Ѱ��� �ڿ����� �Է¹޾� �� ���� ����� ���ʷ� 10�� ���
import java.util.*;

class scanner_Test6 {
	public static void main(String ar[]) {
		int b = 0;	//1��
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();		//2��
		for (int a = 1; a <= 10; a++) {	//3��; 4��; 5��
			System.out.println(b += i);	//6��
		}
	}
}