import java.util.*;

class While_Test2 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;

		while(i <= n) {
			if(i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1부터 n까지의 짝수의 합 : " + sum);
	}
}