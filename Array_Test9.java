//10개의 정수를 입력받아 3의 배수만 출력
import java.util.*;

class Array_Test9 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int a[ ] = new int[ 10 ];

		for(int i = 0; i < a.length; i++){
			System.out.print("정수 입력 : ");
			a[ i ] = sc.nextInt();
		}
		for(int i = 0; i < a.length; i++){
			if(a[ i ] % 3 == 0)
				System.out.println(a[ i ]);
		}
	}
}