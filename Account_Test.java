import java.util.*;

class Account_Test {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		Account a = new Account();
		System.out.print("���¸� �Է� : ");
		a.input_a(sc.next());
		System.out.print("��й�ȣ �Է� : ");
		a.input_p(sc.next());
		System.out.print("������ �Է� : ");
		a.input_o(sc.next());
		System.out.print("�ܰ� �Է� : ");
		a.input_b(sc.nextInt());
			
		while(true){
			System.out.println("\n�Ա��� 1, ����� 2, ����� 3�Է� : ");
			int select = sc.nextInt();
			if(select == 3){
				System.out.println("���� �մϴ�");
				break;
			}
			switch(select){
				case 1 : 
					System.out.println("�Ա� �� �ݾ� �Է� : ");
					a.deposit(sc.nextInt());
					break;
				case 2 : 
					System.out.println("��� �� �ݾ� �Է� : ");
					System.out.println(a.widthDraw(sc.nextInt()) +"���� ��������." );
			}
		}
	}
}