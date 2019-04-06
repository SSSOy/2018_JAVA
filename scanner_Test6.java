//5. 한개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력
import java.util.*;

class scanner_Test6 {
	public static void main(String ar[]) {
		int b = 0;	//1번
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();		//2번
		for (int a = 1; a <= 10; a++) {	//3번; 4번; 5번
			System.out.println(b += i);	//6번
		}
	}
}