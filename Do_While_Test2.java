//2 . �̸�, ����, n�� �Է¹޾� �̸�, ���̸� n�� ���

import java.util.*;

class Do_While_Test2 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("��� Ƚ�� �Է� : ");
		int n = sc.nextInt();
		int i = 1;
		
		do{
			System.out.println("�̸� : " + name + ", ���� : " + age);
			i++;
		} while(i <= n);
	}
}