class Animal_Test {
	public static void main(String ar[]) {
		Animal dog = new Animal(); //��ü����
		dog.name = "������";
		dog.owner = "So Young";

		System.out.println(dog.name);
		System.out.println(dog.owner);

		dog.bark();
		dog.eat();
		System.out.println("\n");

		Animal cat = new Animal();
		cat.name = "������";
		cat.owner = "�ҿ���";

		System.out.println(cat.name);
		System.out.println(cat.owner);

		cat.bark();
		cat.eat();
	}
}