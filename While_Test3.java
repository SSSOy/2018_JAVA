//1. n�� �Է¹޾� 1 ~ n������ 3�� ��� ���

import java.util.*;

class While_Test3 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int n = sc.nextInt();
		int i = 1;
		while(i <= n){
			if(i % 3 == 0){
				System.out.println(i);
			}
			i++;
		}
	}
}