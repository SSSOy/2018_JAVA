class cat3 extends Animal3 {
	public void scratch() {
		System.out.println("������");
	}
	public void eat() {
		System.out.println("������ �Դ�");
	}
	public cat3() {
		super("��ź��", 4);
	}
	public static void main(String ar[]) {
		cat3 c = new cat3();

		System.out.println("Name : " + c.name);
		System.out.println("Leg : " + c.leg);
		c.eat();
		c.scratch();
	}
}