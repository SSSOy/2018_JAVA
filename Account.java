import java.util.*;

class Account{
	private String accountNo;	//���¸�
	private String password;		//��й�ȣ
	private String owner;			//������
	private int balance;				//�ܰ�
	
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
	public void deposit(int x) {			//�Ա�
		balance += x;
		System.out.println(x + "���� �ԱݵǾ����ϴ�.");
		System.out.println("���� �ܰ�� " + balance + "�� �Դϴ�.");
	}
	public int widthDraw(int x) {	//���
		Scanner sc = new Scanner(System.in);
		String p;
		while(true) {	
			System.out.println("��й�ȣ �Է� : ");
			p = sc.next();
			if((p).equals(password))
				break;
			else
				System.out.println("��й�ȣ �Է� ����");
		}
		while(true) {
			if(x > balance){
				System.out.println("�ܾ��� �����մϴ�");
				System.out.println("��� �� �ݾ� �Է� : ");
				x = sc.nextInt();
			}
			else 
				break;
		}
		balance -= x;
		System.out.println("���� �ܰ�� " + balance + "�� �Դϴ�.");
		return (x);
	}
}