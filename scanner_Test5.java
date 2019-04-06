//4. 10이하의 자연수 n 을 입력받아 ABC를 n번 출력
import java.util.*;

class scanner_Test5 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10이하의 자연수를 입력하세요");
		int n = sc.nextInt();	//1번
		if(n<=10) {
			for(int i = 1; i <=n; i++){	//2번; 3번; 4번
				System.out.println("ABC");	//5번
			}
		}
		else{
			System.out.println("10 이상의 자연수를 입력했습니다.");
		}
	}
}