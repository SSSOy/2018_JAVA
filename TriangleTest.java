class Triangle {
	double Height, Base, area;
	public Triangle(double Height, double Base) {
		this.Height = Height;
		this.Base = Base;
	}
	public void Area() {
		area = Height * Base / 2;
	}
	public double findArea() {
			return area;
	}
	public String isSameArea(Triangle t) {
			if(this.area == t.area) 
				return "같습니다";
			else
				return "다릅니다";
	}			
}

class TriangleTest {
	public static void main(String ar[]) {
		Triangle t1 = new Triangle(10.0, 5.0);
		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(8.0, 8.0);
		
		t1.Area();
		t2.Area();
		t3.Area();
		
		System.out.println(t1.findArea());
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}
}