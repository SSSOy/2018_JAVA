import java.util.*;

class free_Test6 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("x�� y�� �Է��ϼ��� >> ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		if((x >= 50 && x <= 100) && (y >= 50 && y <= 100))
			System.out.println("���簢�� �ȿ� �ֽ��ϴ�.");
		else 
			System.out.println("���簢�� �ۿ� �ֽ��ϴ�.");
	}
}