//8. ���� 5���� �Է¹޾Ƽ� ¦��, Ȧ���� �հ� ���
import java.util.*;

class scanner_Test9 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int a = 0;	//1��
		int b = 0;	//2��
		for(int i = 1; i <= 5; i ++) {	//3��; 4��; 5��
			System.out.println("�ڿ����� �Է��ϼ���.");
			int n = sc.nextInt();	//6��
			if(n % 2 == 0) {	
				a += n;	//7��
			}
			else{
				b += n;	//8��
			}
		}
		System.out.println("¦���� �� : " + a);
		System.out.println("Ȧ���� �� : " + b);
	}
}