//1 . n�� �Է¹޾� 1 ~ n������ 5�� ��� ���� ���
import java.util.*;

class Do_While_Test {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		int i = 1;
		int a = 0;
		do{
			if(i % 5 == 0){
				a++;
			}
			i++;
		}while(i <= n);
		System.out.println("1���� n������ 5�� ��� ������ " + a +"�� �Դϴ�.");
	}
}