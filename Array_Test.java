import java.util.*;

class Array_Test{
	public static void main(String ar[]) {	
		Scanner sc = new Scanner(System.in);
		int a[ ] = new int [ 5 ];
		for(int i = 0; i <= a.length; i++)
			a[ i ] = sc.nextInt();
		for(int i = 0; i <= a.length; i++)
			System.out.println(a[i]);
	}
}
