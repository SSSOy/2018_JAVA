import java.util.*;

class  Vending_Machine {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �ݶ�(700��) 	 2. ���̴�(600��)	3. �����꽺(500��)	4. ��(300��)");
		int a = 700; int b = 600; int c = 500; int d = 300;
		System.out.print("�ݾ� �Է� : ");
		int money = sc.nextInt();
		int sum;
		int e = 0;
		int a1000 = 0;
		int a500 = 0;
		int a100 = 0;

		while( true ){
			System.out.print("���� ����( 1 / 2 / 3 / 4) : ");
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
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");	break;
			} 
			System.out.print("���� �Է�  : "); 
			int count = sc.nextInt();
		
			sum = e * count;
			money -= sum;

			System.out.println("�ֹ��Ͻ� ����� " + drink +"�� �̸� ������" + count +"���̰�, �Ž������� " + money +"���Դϴ�.");
			if(money >= 0){
				a1000 = money/1000;
				a500 = (money-(a1000 * 1000)) / 500;
				a100 = (money-(a1000 * 1000)-(a500 * 500))/100;
			}
			System.out.println("1000�� " + a1000 +"��, 500�� " + a500 + "��, 100�� " + a100 +"�� �Դϴ�.");
			System.out.print("�߰��ֹ� �Ͻðڽ��ϱ�?(Yes / No) : ");
			String s = sc.next();
			
			if( s.equals("No")){
				System.out.println("�����մϴ�.");
				break;
			}
		}
	}
}