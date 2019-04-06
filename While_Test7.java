//5. "1학년 1반"  입력받아 5번 출력하기

import java.util.*;

class While_Test7 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1학년1반 입력 : ");
		String s = sc.next();
		
		int i =1;
		while ( i <= 5){
			System.out.println(s);
			i++;
		}
	}
}
