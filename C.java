class A {
	public A() {
		System.out.println("A������");
	}
	public A(int x) {
		System.out.println("�Ű����� A������");
	}
}
class B extends A {
	public B() {
		System.out.println("B������");
	}
	public B(int x) {
		super(x);
		System.out.println("�Ű����� B������");
	}
}
class C {
	public static void main(String ar[]) {
		B b = new B(5);
	}
}
//�ƹ��� ��ð� ���� ��� �θ��� �⺻������ ����
//super() ����.