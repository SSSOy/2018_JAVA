//10개의 정수 입력받아 최대값, 최소값 구하기
import java.util.*;

class Array_Test8 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int arr[ ] = new int[ 10 ];
		int max;
		int min;

		for(int i = 0; i < arr.length; i++) {
			System.out.print("정수 입력 : ");
			arr[ i ] = sc.nextInt();
		}
		max = arr[ 0 ];
		min = arr[ 0 ];
		for(int i = 1; i < arr.length; i++){
			if(max < arr[ i ])
				max = arr[ i ];
			if(min > arr[ i ])
				max = arr[ i ];
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " +min);
	}
}