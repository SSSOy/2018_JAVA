class Dog {
	private String name;
	public String breed;
	private int age;

	public Dog() { }
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public int getAge() {
		return age;
	}
}
class Dog_Test {
	public static void main(String ar[]) {
		Dog d = new Dog("비비", "비숑", 3);
		System.out.println("이름 : " + d.getName());
		System.out.println("견종 : " + d.getBreed());
		System.out.println("나이 : " + d.getAge() + "살");
	}
}
	