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
		System.out.println("넓이 : " + area);
	}
	public void menu() {
		System.out.println("*****도형선택*****");
		System.out.println("1. 삼각형");
		System.out.println("2. 원");
		System.out.println("3. 사다리꼴");
		System.out.println("4. 종료");
	}
}
class Shape3_Test {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		Shape3_1 s = new Shape3_1();
		int choice, x, y, z;

		while(true) {
			s.menu();
			System.out.print("선택 : ");
			choice = sc.nextInt();
			switch(choice) {
				case 1 : 
					System.out.print("밑 변 : ");
					x = sc.nextInt();
					System.out.print("높 이 : ");
					y = sc.nextInt();
					s.Triangle(x, y);
					break;
				case 2 : 
					System.out.print("반지름  : ");
					x = sc.nextInt();
					s.Circle(x);
					break;
				case 3 : 
					System.out.print("밑 변 : ");
					x = sc.nextInt();
					System.out.print("윗 변 : ");
					y = sc.nextInt();
					System.out.print("높 이 : ");
					z = sc.nextInt();
					s.Trapezoid(x, y, z);
					break;
				default :
					System.out.println("감사합니다^0^");
					System.exit(0);
			}
			System.out.println("----------------------------------------");
		}
	}
}