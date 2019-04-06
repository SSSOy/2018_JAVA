class Greeting {
	public String name = "Mike";
	public void sayHello() {
		System.out.println("¾È³ç");
	}
}
class EngHello extends Greeting {
	String name = "Tom";
	public void sayHello() {
		System.out.println("nice to meet you");
	}
	public void test() {
		System.out.println(super.name);
		super.sayHello();
	}
}
class Super_Test2 {
	public static void main(String ar[]) {
		EngHello e = new EngHello();
		e.test();
		e.sayHello();
	}
}