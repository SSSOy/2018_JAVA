//3 . 1 ~ n사이에서 3의 배수 제외하고 출력

import java.util.*;

class Do_While_Test3 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
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