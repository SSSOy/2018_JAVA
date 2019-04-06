class cat extends Animal2 {
	public void setName(String name){
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void scratch() {
		System.out.println("ÇÒÄû´Ù");
	}
	public static void main(String ar[]) {
		cat c1 = new cat();
		c1.setName("Mike");
		System.out.println(c1.getName());
		c1.eat();
	}
}