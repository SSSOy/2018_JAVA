import java.util.*;

class scanner_g {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻÿ� : ");
		int i = sc.nextInt();
		int b;

		for(int a = 1; a <= 9; a++){
			b = i * a;
			System.out.println(i + " * " + a + " = " + b);
		}
	}
}