class Shape2 {
	public void draw() {
		System.out.println("�׸���");
	}
	public void painting() {
		System.out.println("�� ��ĥ�ϱ�");
	}
}
class Circle extends Shape2 {
	public void draw() {
		System.out.println("�� �׸���");
	}
	public void painting() {
		System.out.println("�� ��ĥ�ϱ�");
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