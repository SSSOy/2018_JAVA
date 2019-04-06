import java.util.*;

class Account_Test {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		Account a = new Account();
		System.out.print("계좌명 입력 : ");
		a.input_a(sc.next());
		System.out.print("비밀번호 입력 : ");
		a.input_p(sc.next());
		System.out.print("예금주 입력 : ");
		a.input_o(sc.next());
		System.out.print("잔고 입력 : ");
		a.input_b(sc.nextInt());
			
		while(true){
			System.out.println("\n입금은 1, 출금은 2, 종료는 3입력 : ");
			int select = sc.nextInt();
			if(select == 3){
				System.out.println("종료 합니다");
				break;
			}
			switch(select){
				case 1 : 
					System.out.println("입금 할 금액 입력 : ");
					a.deposit(sc.nextInt());
					break;
				case 2 : 
					System.out.println("출금 할 금액 입력 : ");
					System.out.println(a.widthDraw(sc.nextInt()) +"원을 받으세요." );
			}
		}
	}
}