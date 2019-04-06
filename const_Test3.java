class Car3 {
	Car3() { }
	Car3(String name) {
		System.out.println(name + " Â÷ ÀÌ¸§");
	}
}
class Truck extends Car3 {
	Truck(String name) {
		super("Benz");
		System.out.println(name);
	}
}
class const_Test3 {
	public static void main(String ar[]) {
		Truck t = new Truck("Sonata");
	}
}

//14-15-8-7-3-4-10