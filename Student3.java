class Student3 {
	private String name, telephone;
	private int grade, class1, number;

	Student3(){ }
	Student3(String name) {
		this.name = name;
	}

	public static void main(String ar[]) {
		Student3 kim = new Student3();
		Student3 jang = new Student3("�����");
		Student3 kim2 = new Student3("������");

		System.out.println("�̸��� " + jang.name +"�Դϴ�.");
		System.out.println("�̸��� " + kim2.name +"�Դϴ�.");
	}
}