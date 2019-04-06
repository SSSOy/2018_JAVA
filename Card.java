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
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		balance -= pay;
		System.out.println(pay + "원을 사용하였으며, \n잔액은 " + balance +"원 입니다");
		return 0;
	}
}

class Credit extends Debit {
	final int LIMIT = 30000;
	
	public int Calculation() {
		if(LIMIT < balance + pay) {
			System.out.println("신용한도가 부족합니다.");
			System.out.println("신용한도 부족으로 직불카드 사용합니다.");
			super.Calculation();
			return 0;
		}
		balance += pay;
		System.out.println(pay + "원을 사용하였으며, \n현재 사용한 금액은 " + balance + "원 입니다.");
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
	
			System.out.print("\n1. 직불카드      2. 신용카드      3. 종료 : ");
			int choice = sc.nextInt();
			choice -= 1;
			System.out.println();
			
			if(choice == 2) {
				System.out.println("종료합니다^^\n");
				System.exit(0);
			}

			System.out.print("얼마를 사용하시겠습니까? : ");
			card[choice].pay = sc.nextInt();
			card[choice].Calculation();
		}
	}
}