class Person5 {
	String name;
	int age;
	int height;

	public Person5(String name, int age, int height){
		this(name, age);
	}
	public Person5(String name, int age){
		this(age);
		this.name = "Tom";
	}
	public Person5(int a){
		this();
		this.age = a;
	}
	public Person5(){
		this.height = 175;
		this.name = "Alice";
	}
	public void eat(String s) {
		System.out.println("ธิดู");
	}
	//26-6-7-9-10-13-14-17-18-19-15-11
	public static void main(String ar[]) {
		Person5 p = new Person5("Mike", 30, 180);
	}
}