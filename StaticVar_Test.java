class Student4 {
	private String name;
	private int grade;
	static int count = 0;

	Student4 () { 
		count++;
	}
}
class StaticVar_Test {
	public static void main(String ar[]) {
		Student4 s1 = new Student4();
		Student4 s2 = new Student4();
		Student4 s3 = new Student4();
		Student4 s4 = new Student4();
		Student4 s5 = new Student4();
		
		System.out.println("���� �� �л��� ��ü ���� " + Student4.count +"�� �Դϴ�.");
	}
}