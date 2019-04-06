//순서 바꾸기

import java.util.*;
class Array_Test10 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[ 10 ];
		int b;

		for(int i = 0; i < a.length; i++){
			System.out.print("정수 입력 : ");
			a[ i ] = sc.nextInt();
		}
		
		int j = 9;
		for(int i = 0; i <= 4; i++){
				b = a[ i ];
				a[ i ] = a[ j ];
				a[ j ] = b;
				j--;
		}
		for(int i = 0; i < a.length; i++)
			System.out.print(a[ i ] + "   ");
		System.out.println("");
	}
}