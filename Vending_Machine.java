import java.util.*;

class  Vending_Machine {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 콜라(700원) 	 2. 사이다(600원)	3. 감귤쥬스(500원)	4. 물(300원)");
		int a = 700; int b = 600; int c = 500; int d = 300;
		System.out.print("금액 입력 : ");
		int money = sc.nextInt();
		int sum;
		int e = 0;
		int a1000 = 0;
		int a500 = 0;
		int a100 = 0;

		while( true ){
			System.out.print("음료 선택( 1 / 2 / 3 / 4) : ");
			int drink = sc.nextInt();
			switch(drink) {
				case 1 :
					e = a;	break;
				case 2 : 
					e = b;	break;
				case 3 : 
					e = c;	 	break;
				case 4 :
					e = d;	break;
				default :
					System.out.println("잘못 입력하셨습니다.");	break;
			} 
			System.out.print("수량 입력  : "); 
			int count = sc.nextInt();
		
			sum = e * count;
			money -= sum;

			System.out.println("주문하신 음료는 " + drink +"번 이며 개수는" + count +"개이고, 거스름돈은 " + money +"원입니다.");
			if(money >= 0){
				a1000 = money/1000;
				a500 = (money-(a1000 * 1000)) / 500;
				a100 = (money-(a1000 * 1000)-(a500 * 500))/100;
			}
			System.out.println("1000원 " + a1000 +"개, 500원 " + a500 + "개, 100원 " + a100 +"개 입니다.");
			System.out.print("추가주문 하시겠습니까?(Yes / No) : ");
			String s = sc.next();
			
			if( s.equals("No")){
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}