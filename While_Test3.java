//1. n을 입력받아 1 ~ n까지의 3의 배수 출력

import java.util.*;

class While_Test3 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
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