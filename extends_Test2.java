class Student7 {
	String name, address, department, phone;
	int id;

	Student7(String name, int id, String phone, String address, String department) {
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.address = address;
		this.department = department;
	}

	public void study() {
		System.out.println("공부합니다");
	}
	public void eat() {
		System.out.println("먹습니다");
	}
	public void test() {
		System.out.println("시험봅니다");
	}
	public void act() {
		System.out.println("활동합니다");
	}
}
class Leader extends Student7 {
	boolean classPresident;

	public Leader(String name, int id, String phone, String address, String department, boolean classPresident) {

		super(name, id, phone, address, department);
		this.classPresident = classPresident;
	}

	public void hello() {
		System.out.println("차렷! 선생님께 경례!");
	}
}

class extends_Test2 {
	public static void main(String ar[]) {

		Leader l = new Leader("소영", 1104, "01041001495", "경기도 의정부", "소프트웨어", false);

		System.out.println("이름 : " + l.name);
		System.out.println("학번 : " + l.id);
		System.out.println("전화번호 : " + l.phone);
		System.out.println("주소 : " + l.address);
		System.out.println("학과 : " + l.department);
		System.out.println("");
		
		if(l.classPresident == true) 
			l.hello();
		else
			System.out.println("반장이 아닙니다");
		
		l.study();
		l.eat();
		l.test();
		l.act();
	}
}