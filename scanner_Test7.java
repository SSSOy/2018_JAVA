//6. 100������ �ڿ��� n�� �Է¹ް� n���� ������ �Է¹޾� ��� ���
import java.util.*;

class scanner_Test7 {
	public static void main(String ar []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("100 ������ �ڿ����� �Է��ϼ���");
		int n = sc.nextInt();	//1��
		int a = 0;	//2��
		if(n <= 100){
			for(int i = 1; i <= n; i++) {	 //3��; 4��; 5��
				System.out.println("�ڿ����� �Է��ϼ���");
				int b = sc.nextInt();	//6��
				a += b;	//7��
			}
		System.out.println("��� : "+ a/n);	//8��
		}
		else{
			System.out.println("100�̻��� �ڿ����� �Է��߽��ϴ�.");
		}
	}
}
