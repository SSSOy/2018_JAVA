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

			System.out.print("���̵� �Է� : ");
			result1 = l.check(i, sc.next());
			i++;

			System.out.print("��й�ȣ �Է� : ");
			result2 = l.check(i, sc.next());

			System.out.println("");
			if(result1 != true) {
				System.out.println("���̵� �߸��Է��ϼ̽��ϴ�!");
				tresult = false;
			}
			if(result2 != true) {
				System.out.println("��й�ȣ�� �߸��Է��ϼ̽��ϴ�!");
				tresult = false;
			}
			
			if(tresult == true) {
				System.out.println("\n�α��� �Ǿ����ϴ�^^\n");
				System.exit(0);
			}
			else {
				System.out.println("\n!!�ٽ� �α��� ���ּ���!!\n");				
			}
		}
	}
}