class Student3 {
	private String name, telephone;
	private int grade, class1, number;

	Student3(){ }
	Student3(String name) {
		this.name = name;
	}

	public static void main(String ar[]) {
		Student3 kim = new Student3();
		Student3 jang = new Student3("장민재");
		Student3 kim2 = new Student3("김현우");

		System.out.println("이름은 " + jang.name +"입니다.");
		System.out.println("이름은 " + kim2.name +"입니다.");
	}
}