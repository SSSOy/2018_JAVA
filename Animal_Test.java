class Animal_Test {
	public static void main(String ar[]) {
		Animal dog = new Animal(); //°´Ã¼»ý¼º
		dog.name = "°­¾ÆÁö";
		dog.owner = "So Young";

		System.out.println(dog.name);
		System.out.println(dog.owner);

		dog.bark();
		dog.eat();
		System.out.println("\n");

		Animal cat = new Animal();
		cat.name = "ÆûÆûÀÌ";
		cat.owner = "¼Ò¿µÀÌ";

		System.out.println(cat.name);
		System.out.println(cat.owner);

		cat.bark();
		cat.eat();
	}
}