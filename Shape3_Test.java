import java.util.*;

abstract class Shape3 {
	double area;
	final double PI = 3.141592;

	abstract public void Circle(int x);
	abstract public void Triangle(int x, int y);
	abstract public void Trapezoid(int x, int y, int z);
	abstract public void Output(double area);
	abstract public void menu();
}
class Shape3_1 extends Shape3 {

	public void Circle(int x) {
		area = x * x * PI;
		Output(area);
	}
	public void Triangle(int x, int y) {
		area = (double)(x * y) / 2;
		Output(area);
	}
	public void Trapezoid(int x, int y, int z) {
		area = (double)((x + y) * z) / 2;
		Output(area);
	}
	public void Output(double area) {
		System.out.println("���� : " + area);
	}
	public void menu() {
		System.out.println("*****��������*****");
		System.out.println("1. �ﰢ��");
		System.out.println("2. ��");
		System.out.println("3. ��ٸ���");
		System.out.println("4. ����");
	}
}
class Shape3_Test {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		Shape3_1 s = new Shape3_1();
		int choice, x, y, z;

		while(true) {
			s.menu();
			System.out.print("���� : ");
			choice = sc.nextInt();
			switch(choice) {
				case 1 : 
					System.out.print("�� �� : ");
					x = sc.nextInt();
					System.out.print("�� �� : ");
					y = sc.nextInt();
					s.Triangle(x, y);
					break;
				case 2 : 
					System.out.print("������  : ");
					x = sc.nextInt();
					s.Circle(x);
					break;
				case 3 : 
					System.out.print("�� �� : ");
					x = sc.nextInt();
					System.out.print("�� �� : ");
					y = sc.nextInt();
					System.out.print("�� �� : ");
					z = sc.nextInt();
					s.Trapezoid(x, y, z);
					break;
				default :
					System.out.println("�����մϴ�^0^");
					System.exit(0);
			}
			System.out.println("----------------------------------------");
		}
	}
}