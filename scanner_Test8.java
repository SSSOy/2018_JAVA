//7. 정수를 입력받아서 1부터 입력받은 정수까지의 5의 배수의 합 출력
import java.util.*;

class scanner_Test8 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//1번
		int a = 0;	//2번
		for (int i = 5; i <= n; i += 5) {	//3번; 4번; 5번
			a += i;	//6번
		}
		System.out.println("5의 배수의 합 : "+ a);
	}
}