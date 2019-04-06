class Student {
	String name;
	int ban, no, kor, eng, math;
	
	public int getTotal() {
		return (this.kor + this.eng + this.math);
	}
	public float getAverage() {
		float avg = (float)(this.kor + this.eng + this.math) / 3;
		if((avg * 100) % 10 >= 5)
			avg += 0.05;
		avg = (int)(avg * 10);
		avg /= 10;
		return avg;
	}
}

class Exercise6_4 {
	public static void main(String args[]) {
		Student s = new Student();

		s.name = "È«±æµ¿";
		s.ban = 1;
		s.no = 1; 
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("ÀÌ¸§ : " + s.name);
		System.out.println("ÃÑÁ¡ : " + s.getTotal());
		System.out.println("Æò±Õ : " + s.getAverage());
	}
}