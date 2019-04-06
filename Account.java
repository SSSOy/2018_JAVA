import java.util.*;

class Account{
	private String accountNo;	//계좌명
	private String password;		//비밀번호
	private String owner;			//예금주
	private int balance;				//잔고
	
	public void input_a(String a){
		accountNo = a;
	}
	public void input_p(String a){
		password = a;
	}
	public void input_o(String a){
		owner = a;
	}
	 public void input_b(int a){
		balance = a;
	}
	public void deposit(int x) {			//입금
		balance += x;
		System.out.println(x + "원이 입금되었습니다.");
		System.out.println("남은 잔고는 " + balance + "원 입니다.");
	}
	public int widthDraw(int x) {	//출금
		Scanner sc = new Scanner(System.in);
		String p;
		while(true) {	
			System.out.println("비밀번호 입력 : ");
			p = sc.next();
			if((p).equals(password))
				break;
			else
				System.out.println("비밀번호 입력 오류");
		}
		while(true) {
			if(x > balance){
				System.out.println("잔액이 부족합니다");
				System.out.println("출금 할 금액 입력 : ");
				x = sc.nextInt();
			}
			else 
				break;
		}
		balance -= x;
		System.out.println("남은 잔고는 " + balance + "원 입니다.");
		return (x);
	}
}