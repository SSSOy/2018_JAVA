//오름차순으로 정리

import java.util.*;

class Array_Array_Test3 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int a[ ] = new int[ 10 ];
		int b;

		for(int i = 0; i < a.length; i++){
			System.out.print("정수 입력 : ");
			a[ i ] = sc.nextInt();
		}
		for(int i = 0; i < a.length; i++){
			for(int j = 1; j + i < a.length; j++){
				if(a[ i ] > a[ i + j]){
					b = a[ i ];
					a[ i ] = a[ i + j ];
					a[ i + j ] = b;
				}
			}
		}
		for(int i = 0; i < a.length; i++)
			System.out.println(a[ i ]);
	}
}