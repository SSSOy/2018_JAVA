class dog3 extends Animal3 {
	public void bark() {
		System.out.println("¢��");
	}
	public dog3() {
		super("������", 4);
	}
	public static void main(String ar[]) {
		dog3 d = new dog3();

		System.out.println("Name : " + d.name);
		System.out.println("Leg : " + d.leg);
		d.eat();
		d.bark();
	}
}