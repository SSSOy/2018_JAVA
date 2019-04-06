class A {
	public A() {
		System.out.println("A생성자");
	}
	public A(int x) {
		System.out.println("매개변수 A생성자");
	}
}
class B extends A {
	public B() {
		System.out.println("B생성자");
	}
	public B(int x) {
		super(x);
		System.out.println("매개변수 B생성자");
	}
}
class C {
	public static void main(String ar[]) {
		B b = new B(5);
	}
}
//아무런 명시가 없는 경우 부모의 기본생성자 실행
//super() 생략.