import java.util.*;

class Login {
	String id, password;
	
	public Login() { }
	public Login(String id, String password) {
		this.id = id;
		this.password = password;
	}

	public boolean check(int i, String bh) {
		String c = null;
		switch(i) {
			case 1 : 
				c = this.id;				break;
			case 2 : 
				c = this.password;	break;
			default : 
		}
		
		if(!(c.equals(bh))) 
			return false;
		return true;
	}
}

class Login_Test {
	public static void main(String ar[]) {

		Scanner sc = new Scanner(System.in);
		Login l = new Login("psy00627", "bbh0506");

		while(true) {
			int i = 1;
			boolean result1, result2, tresult = true;

			System.out.print("아이디 입력 : ");
			result1 = l.check(i, sc.next());
			i++;

			System.out.print("비밀번호 입력 : ");
			result2 = l.check(i, sc.next());

			System.out.println("");
			if(result1 != true) {
				System.out.println("아이디를 잘못입력하셨습니다!");
				tresult = false;
			}
			if(result2 != true) {
				System.out.println("비밀번호를 잘못입력하셨습니다!");
				tresult = false;
			}
			
			if(tresult == true) {
				System.out.println("\n로그인 되었습니다^^\n");
				System.exit(0);
			}
			else {
				System.out.println("\n!!다시 로그인 해주세요!!\n");				
			}
		}
	}
}