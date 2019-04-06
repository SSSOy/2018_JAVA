class Rectangle {
	int x1, y1, x2, y2;
	public Rectangle() { }
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public int square(){
		int wide  = (this.x2 - this.x1) * (this.y2 - this.y1);
		if(wide < 0)
			wide *= -1;
		return wide;
	}
	public void show(){
		System.out.print("x1 : " + this.x1);
		System.out.println("	y1 : " + this.y1);
		System.out.print("x2 : " + this.x2);
		System.out.println("	y2 : " + this.y2);
		System.out.println("넓이 : " + this.square() + "\n");
	}
	public boolean equals(Rectangle r) {
		if(this == r)
			return true;
		else 
			return false;
	}

	public static void main(String ar[]) {
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1, 1, 2, 3);
		r.show();
		s.show();
		System.out.println("s.square : " + s.square() + "\n");
		r.set(-2, 2, -1, 4);
		r.show();
		System.out.println("r.square : " + r.square() + "\n");
		if(r.equals(s))
			System.out.println("두 사각형은 같습니다");
	}
}