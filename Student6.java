class Student6 {
	String name;
	int grade, money;
	Student6(String name, int grade, int money){
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}
	void showInfo() {
		System.out.println(this.name + "�� ���� ���� " + this.money + "�� �Դϴ�.");
	}
}