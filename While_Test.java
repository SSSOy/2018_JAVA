import java.util.*;

class While_Test {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;

		while(i <= 9) {
			System.out.println(n + " * " + i + " = " + (n * i));
			i++;
		}
	}
}