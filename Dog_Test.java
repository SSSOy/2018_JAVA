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
		Dog d = new Dog("���", "���", 3);
		System.out.println("�̸� : " + d.getName());
		System.out.println("���� : " + d.getBreed());
		System.out.println("���� : " + d.getAge() + "��");
	}
}
	