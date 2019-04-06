class Student5 {
	String name;
	int grade, class1;

	Student5() {
		this.name = name;
		this.grade = grade;
		this.class1 = 1;
	}
	Student5(String name){
		this(name, 1);
	}
	Student5(String name, int grade){
		this();
	}
	public static void main(String ar[]) {
		Student5 s = new Student5("Mike");
		System.out.println(s.name);
		System.out.print(s.grade + "ÇÐ³â ");
		System.out.println(s.class1 + "¹Ý");
	}
}

//16-17-10-11-13-14-5-6-7-8-9-15-12-18-19-20