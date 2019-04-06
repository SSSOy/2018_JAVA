class Shape2 {
	public void draw() {
		System.out.println("그리다");
	}
	public void painting() {
		System.out.println("원 색칠하기");
	}
}
class Circle extends Shape2 {
	public void draw() {
		System.out.println("원 그리기");
	}
	public void painting() {
		System.out.println("원 색칠하기");
	}
}
class Exam1 {
	public static void main(String ar[]) {
		Shape2 s = new Shape2();
		Circle c = new Circle();
		Shape2 s2 = new Circle();
		s2.draw();
		s2.painting();
	}
}