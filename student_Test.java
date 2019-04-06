class student_Test {	
	public static void main(String ar[]) {
		student s1 = new student();
		s1.name = "소영";
		s1.id = 1104;
		System.out.println(s1.name);
		System.out.println(s1.id);
		s1.study();
		s1.run();

		student s2 = new student();
		s2.name = "백현";
		s2.id = 506;
		System.out.println(s2.name);
		System.out.println(s2.id);
		s2.study();
		s2.run();
	}
}