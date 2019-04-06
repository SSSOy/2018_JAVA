import java.util.*;
class free_Test1 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int n[ ] = new int[5];
		int sum1 = 0, sum2 = 0;

		for(int i = 0; i < n.length; i++) {
			n[ i ] = sc.nextInt();
			if(n[ i ] % 2 == 0) 
				sum1 += n[ i ];
			else 
				sum2 += n[ i ];
		}
		System.out.println("Â¦¼öÀÇ ÇÕ : " + sum1 + "È¦¼öÀÇ ÇÕ : " + sum2);
	}
}