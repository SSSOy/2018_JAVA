//3 . 1 ~ n���̿��� 3�� ��� �����ϰ� ���

import java.util.*;

class Do_While_Test3 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		int i = 0;
		
		do {	
			i++;
			if(i % 3 == 0) {
				continue;
			}
			System.out.println( i );
		} while( i < n );
	}
}