//5개의 정수 입력받아 합 구하기
import java.util.*;

class Array_Test7 {
	public static void mai기(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int a[ ] = new int[ 5 ];
		int sum = 0;

		for(int i = 0; i < a.length; i++){
			System.out.print("정수 입력 : ");
			a[ i ] = sc.nextInt();
			sum += a[ i ];
		}
		System.out.println("합 : "+ sum);
	}
}