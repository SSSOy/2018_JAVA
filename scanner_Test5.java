//4. 10������ �ڿ��� n �� �Է¹޾� ABC�� n�� ���
import java.util.*;

class scanner_Test5 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10������ �ڿ����� �Է��ϼ���");
		int n = sc.nextInt();	//1��
		if(n<=10) {
			for(int i = 1; i <=n; i++){	//2��; 3��; 4��
				System.out.println("ABC");	//5��
			}
		}
		else{
			System.out.println("10 �̻��� �ڿ����� �Է��߽��ϴ�.");
		}
	}
}