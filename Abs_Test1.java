abstract class Abs1 {
	String color;
	public void go() {
		System.out.println("����");
	}
	abstract public void eat();
	abstract public void walk();
}

abstract class child1 extends Abs1 {
		public void eat() {
				System.out.println("�Դ�");
		}
}
class child2 extends child1 {
		public void walk() {
				System.out.println("�ȴ�");
		}
}

class Abs_Test1 {
	public static void main(String ar[]) {
			child2 c = new child2();
			c.eat();
			c.walk();
	}
}