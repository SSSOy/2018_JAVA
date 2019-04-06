class cat3 extends Animal3 {
	public void scratch() {
		System.out.println("ÇÒÄû´Ù");
	}
	public void eat() {
		System.out.println("»ý¼±À» ¸Ô´Ù");
	}
	public cat3() {
		super("¿¬ÅºÀÌ", 4);
	}
	public static void main(String ar[]) {
		cat3 c = new cat3();

		System.out.println("Name : " + c.name);
		System.out.println("Leg : " + c.leg);
		c.eat();
		c.scratch();
	}
}