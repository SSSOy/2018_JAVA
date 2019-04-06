import java.util.*;

class free_Test7 {	
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력 : ");
		int n = sc.nextInt();
		n /= 10;
		n = n * 10 + 1;

		System.out.println(n);
	}
}
