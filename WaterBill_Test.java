import java.util.*;
class WaterBill {

	final int HomeLiter = 50;
	final int BusinessLiter = 45;
	final int IndustryLiter = 30;
	int bill;

	public void menu() {
		System.out.println("*********** MENU **********");
		System.out.println("1. 가정용(liter 당 " + HomeLiter + "원)");
		System.out.println("2. 상업용(liter 당 " + BusinessLiter + "원)");
		System.out.println("3. 공업용(liter 당 " + IndustryLiter + "원)");
		System.out.println("4. 종료");
	}
	public void line() {
		System.out.println("-----------------------------------------");
	}
	public void print(int i, int a, int liter) {
		this.line();
		System.out.println("사용자 코드 : " + i);
		System.out.println("사용 요금 : " + a * liter);
		System.out.println("총 수도요금 : " + ((a * liter) + (a * 5)));
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
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();

			if(	choice == 4) {
				System.out.println("종료합니다^0^");
				System.exit(0);
			}

			w.line();
			System.out.print("사용량 입력(liter) : ");
			int liter = sc.nextInt();

			switch(choice) {
				case 1 : 
					w.print(i, w.HomeLiter, liter);		break;
				case 2 : 
					w.print(i, w.BusinessLiter, liter);	break;
				case 3 : 
					w.print(i, w.IndustryLiter, liter);	break;
				default : 
					System.out.println("잘못 입력했습니다.");
			}
			i++;
		}
	}
}