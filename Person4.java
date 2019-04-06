class Person4 {
	private String name;
	private int age;
	public String eat(){
		return("π‰¿ª ∏‘¥Ÿ");
	}
	
	Person4() { }
	Person4(String name, int age){
		this.name = name;
		this.age = age;
	}
	Person4(int age){
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	public void pr(){
		System.out.println(this.name);
		System.out.println(this.age);
	}

	public static void main(String ar[]) {
		Person4 p1 = new Person4();
		Person4 p2 = new Person4("John", 15);
		Person4 p3 = new Person4(35);

		p1.setName("Mike");
		p1.setAge(30);

		p1.pr();
		p2.pr();
		p3.pr();
		
	}
}