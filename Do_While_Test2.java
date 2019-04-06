//2 . 이름, 나이, n을 입력받아 이름, 나이를 n번 출력

import java.util.*;

class Do_While_Test2 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("출력 횟수 입력 : ");
		int n = sc.nextInt();
		int i = 1;
		
		do{
			System.out.println("이름 : " + name + ", 나이 : " + age);
			i++;
		} while(i <= n);
	}
}