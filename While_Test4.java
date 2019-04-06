//2. n, m을 입력받아 n부터 m까지 짝수의 합, 홀수의 합 구하기

import java.util.*;

class While_Test4 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		System.out.print("정수 입력 : ");
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
		
		System.out.println("짝수의 합 : " + a);
		System.out.println("홀수의 합 : " + b);
	}
}