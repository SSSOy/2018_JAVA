class Student2_Test {
	public static void main(String ar[]) {
		Student2 s = new Student2();

		s.name = "�ҿ�";
		s.grade = 1;
		s.sub = "JAVA";
		System.out.println(s.name);
		System.out.println(s.grade + "�г�");
		System.out.println(s.sub);

		s.study(s.sub, 5);
		s.run();
		s.play("������", "������");
	}
}