class Shape1 {
	int x, y;

	void setArea(int x, int y) {  //면적구할 수 있는 값 세팅
		this.x = x;
		this.y = y;
	}
	float getArea() { //면적 구하기
		return x * y;
	}
}

class Circle extends Shape1 {
	float getArea() { //면적 구하기
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

		System.out.println("원의 넓이 : " + c.getArea());
		System.out.println("사각형의 넓이 : " + r.getArea());
		System.out.println("평행사변형의 넓이 : " + d.getArea());
	}
}

		