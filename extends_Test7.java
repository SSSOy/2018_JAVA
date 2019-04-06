class Shape1 {
	int x, y;

	void setArea(int x, int y) {  //�������� �� �ִ� �� ����
		this.x = x;
		this.y = y;
	}
	float getArea() { //���� ���ϱ�
		return x * y;
	}
}

class Circle extends Shape1 {
	float getArea() { //���� ���ϱ�
		return (x * y * (float)3.14);
	}
}

class Rect extends Shape1 {

}

class Diamond extends Shape1 {

}

class extends_Test7 {
	public static void main(String ar[]) {
		Circle c = new Circle();
		Rect r = new Rect();
		Diamond d = new Diamond();
		
		c.setArea(5, 6);
		r.setArea(7, 8);
		d.setArea(9, 9);

		System.out.println("���� ���� : " + c.getArea());
		System.out.println("�簢���� ���� : " + r.getArea());
		System.out.println("����纯���� ���� : " + d.getArea());
	}
}

		