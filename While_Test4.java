//2. n, m�� �Է¹޾� n���� m���� ¦���� ��, Ȧ���� �� ���ϱ�

import java.util.*;

class While_Test4 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		System.out.print("���� �Է� : ");
		int m = sc.nextInt();
		
		int a = 0; int b = 0;
		while(n <= m){
			if(n % 2 == 0){
				a +=n;
			}
			else {
				b += n;
			}
			n++;
		}
		
		System.out.println("¦���� �� : " + a);
		System.out.println("Ȧ���� �� : " + b);
	}
}