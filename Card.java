import java.util.*;

class Debit {
	int balance;
	int pay;

	public Debit() { }
	public Debit(int balance) {
		this.balance = balance;
	}
	public int Calculation() {
		if(balance < pay) {
			System.out.println("�ܾ��� �����մϴ�.");
			return 0;
		}
		balance -= pay;
		System.out.println(pay + "���� ����Ͽ�����, \n�ܾ��� " + balance +"�� �Դϴ�");
		return 0;
	}
}

class Credit extends Debit {
	final int LIMIT = 30000;
	
	public int Calculation() {
		if(LIMIT < balance + pay) {
			System.out.println("�ſ��ѵ��� �����մϴ�.");
			System.out.println("�ſ��ѵ� �������� ����ī�� ����մϴ�.");
			super.Calculation();
			return 0;
		}
		balance += pay;
		System.out.println(pay + "���� ����Ͽ�����, \n���� ����� �ݾ��� " + balance + "�� �Դϴ�.");
		return 0;
	}
}

class Card {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		Debit card[] = new Debit[2];
		int money;

		card[0] = new Debit(10000);
		card[1] = new Credit();
		
		while(true) {
	
			System.out.print("\n1. ����ī��      2. �ſ�ī��      3. ���� : ");
			int choice = sc.nextInt();
			choice -= 1;
			System.out.println();
			
			if(choice == 2) {
				System.out.println("�����մϴ�^^\n");
				System.exit(0);
			}

			System.out.print("�󸶸� ����Ͻðڽ��ϱ�? : ");
			card[choice].pay = sc.nextInt();
			card[choice].Calculation();
		}
	}
}