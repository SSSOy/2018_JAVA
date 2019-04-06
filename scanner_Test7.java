//6. 100이하의 자연수 n을 입력받고 n개의 정수를 입력받아 평균 출력
import java.util.*;

class scanner_Test7 {
	public static void main(String ar []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("100 이하의 자연수를 입력하세요");
		int n = sc.nextInt();	//1번
		int a = 0;	//2번
		if(n <= 100){
			for(int i = 1; i <= n; i++) {	 //3번; 4번; 5번
				System.out.println("자연수를 입력하세요");
				int b = sc.nextInt();	//6번
				a += b;	//7번
			}
		System.out.println("평균 : "+ a/n);	//8번
		}
		else{
			System.out.println("100이상의 자연수를 입력했습니다.");
		}
	}
}
