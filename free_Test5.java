import java.util.*;

class free_Test5 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("���� 1�� �Է� : ");
		char c = sc.next().charAt(0);
	
		if(c >= 65 && c <= 90)
			System.out.println("�빮�� �Դϴ�.");
		else if(c >= 97 && c <= 122)
			System.out.println("�ҹ��� �Դϴ�.");
		else 
			System.out.println("�߸� �Է��߽��ϴ�.");
	}
}