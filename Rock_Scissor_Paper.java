import java.util.*;

class Rock_Scissor_Paper {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� ���� ����! (����/����/�� �� �Ѱ� �Է�)");
		System.out.print("ö�� : ");
		String c = sc.next();
		System.out.print("���� : ");
		String y = sc.next();

		switch(c) {
		case "����" : 
			switch(y){
				case "����" :
					System.out.println("�����ϴ�.");
					break;
				case "����" :
					System.out.println("���� �̰���ϴ�.");
					break;
				case "��" :
					System.out.println("ö���� �̰���ϴ�.");
					break;
				default :
					System.out.println("�߸� �Է��ϼ̽��ϴ�");
					break;
			}
			break;
		case "����" :
			switch(y){
				case "����" :
					System.out.println("ö���� �̰���ϴ�.");
					break;
				case "����" :
					System.out.println("�����ϴ�.");
					break;
				case "��" :
					System.out.println("���� �̰���ϴ�.");
					break;
				default :
					System.out.println("�߸� �Է��ϼ̽��ϴ�");
					break;
			}
			break;
		case "��" :
			switch(y){
				case "����" :
					System.out.println("���� �̰���ϴ�.");
					break;
				case "����" : 
					System.out.println("ö���� �̰���ϴ�.");
					break;
				case "��" :
					System.out.println("�����ϴ�.");
					break;
				default :
					System.out.println("�߸� �Է��ϼ̽��ϴ�");
					break;
			}
			break;
			default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
			break;
		}
	}
}	 