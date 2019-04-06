class Person3 {
	private String name;
	private int age;

	public void eat(){
		System.out.println("ธิดู");
	}
	Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	Person3(String name){
		this.name = name;
	}
	Person3(int age) {
		this.age = age;
	}
	Person3(){}


	public static void main(String ar[]) {
		Person3 p1 = new Person3("Mike", 30);
		Person3 p2 = new Person3("Alice", 25);
		Person3 p3 = new Person3("Tom");
		Person3 p4 = new Person3(20);
		Person3 p5 = new Person3();

		System.out.println(p4.name);
		System.out.println(p4.age);
		p3.eat();
	}
}


