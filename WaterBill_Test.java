import java.util.*;
class WaterBill {

	final int HomeLiter = 50;
	final int BusinessLiter = 45;
	final int IndustryLiter = 30;
	int bill;

	public void menu() {
		System.out.println("*********** MENU **********");
		System.out.println("1. ������(liter �� " + HomeLiter + "��)");
		System.out.println("2. �����(liter �� " + BusinessLiter + "��)");
		System.out.println("3. ������(liter �� " + IndustryLiter + "��)");
		System.out.println("4. ����");
	}
	public void line() {
		System.out.println("-----------------------------------------");
	}
	public void print(int i, int a, int liter) {
		this.line();
		System.out.println("����� �ڵ� : " + i);
		System.out.println("��� ��� : " + a * liter);
		System.out.println("�� ������� : " + ((a * liter) + (a * 5)));
		this.line();
	}
}

class WaterBill_Test {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		WaterBill w = new WaterBill();
		int i = 1; 

		while(true) {
			w.menu();
			w.line();
			System.out.print("�޴� ���� : ");
			int choice = sc.nextInt();

			if(	choice == 4) {
				System.out.println("�����մϴ�^0^");
				System.exit(0);
			}

			w.line();
			System.out.print("��뷮 �Է�(liter) : ");
			int liter = sc.nextInt();

			switch(choice) {
				case 1 : 
					w.print(i, w.HomeLiter, liter);		break;
				case 2 : 
					w.print(i, w.BusinessLiter, liter);	break;
				case 3 : 
					w.print(i, w.IndustryLiter, liter);	break;
				default : 
					System.out.println("�߸� �Է��߽��ϴ�.");
			}
			i++;
		}
	}
}