class person_Test {
	public static void main(String ar[]) {
		person p1 = new person();
		p1.name = "Mike";
		p1.age = 20;
		System.out.println(p1.name + "\n" + p1.age);
		p1.sleep();
		p1.play();

		person p2 = new person();
		p2.name = "Tom";
		p2.age = 30;
		System.out.println(p2.name + "\n" + p2.age);
		p2.sleep();
		p2.play();
	}
}
