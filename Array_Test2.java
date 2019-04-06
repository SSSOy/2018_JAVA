import java.util.*;

class Array_Test2{
	public static void main(String ar[]) {	
		Scanner sc = new Scanner(System.in);
		int a[ ] = new int [ 5 ];
		int sum = 0;
		for(int i = 0; i < a.length; i++)
			a[ i ] = sc.nextInt();
		for(int i = 0; i < a.length; i++)
			sum += a[ i ];
		System.out.println(sum);
	}
}