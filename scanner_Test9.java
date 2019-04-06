//8. 정수 5개를 입력받아서 짝수, 홀수별 합계 출력
import java.util.*;

class scanner_Test9 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int a = 0;	//1번
		int b = 0;	//2번
		for(int i = 1; i <= 5; i ++) {	//3번; 4번; 5번
			System.out.println("자연수를 입력하세요.");
			int n = sc.nextInt();	//6번
			if(n % 2 == 0) {	
				a += n;	//7번
			}
			else{
				b += n;	//8번
			}
		}
		System.out.println("짝수의 합 : " + a);
		System.out.println("홀수의 합 : " + b);
	}
}