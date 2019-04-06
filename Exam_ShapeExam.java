import java.util.*;

abstract class ShapeExam {
	final double PI = 3.14;
	public abstract double getArea(int x);
	public abstract double getCircum(int y);
}
class Exam1 extends ShapeExam {
	public double getArea(int x) {
		return (x * x * PI);
	}
	public double getCircum(int y) {
		return(2 * y * PI);
	}
}
class Exam_ShapeExam {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int r;
		System.out.print("반지름 입력 : ");
		r = sc.nextInt();
		
		Exam1 e = new Exam1();
		System.out.println("면적 : " + e.getArea(r));
		System.out.println("둘레 : " + e.getCircum(r));
	}
}