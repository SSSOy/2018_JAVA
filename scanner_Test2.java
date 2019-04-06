//1. 임의의 정수 입력받아 4로 나눈 나머지
import java.util.*;

class scanner_Test2 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int a;
		int i = sc.nextInt();
		a = i %4;
		System.out.println("i를 4로 나눈 나머지 : " + a);
	}
}
