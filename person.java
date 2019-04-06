class person1 {
	String name;
	int age;
	public void sleep(){
		System.out.println("ÀÚ´Ù");
	}
	public void play(){
		System.out.println("³î´Ù"); 
	}
	
	public static void main(String ar[]) {
		person1 p1 = new person1();
		p1.name = "Mike";
		p1.age = 20;
		System.out.println(p1.name + "\n" + p1.age);
		p1.sleep();
		p1.play();

		person1 p2 = new person1();
		p2.name = "Tom";
		p2.age = 30;
		System.out.println(p2.name + "\n" + p2.age);
		p2.sleep();
		p2.play();
	}
}