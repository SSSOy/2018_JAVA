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
		System.out.println("�����մϴ�");
	}
	public void eat() {
		System.out.println("�Խ��ϴ�");
	}
	public void test() {
		System.out.println("���躾�ϴ�");
	}
	public void act() {
		System.out.println("Ȱ���մϴ�");
	}
}
class Leader extends Student7 {
	boolean classPresident;

	public Leader(String name, int id, String phone, String address, String department, boolean classPresident) {

		super(name, id, phone, address, department);
		this.classPresident = classPresident;
	}

	public void hello() {
		System.out.println("����! �����Բ� ���!");
	}
}

class extends_Test2 {
	public static void main(String ar[]) {

		Leader l = new Leader("�ҿ�", 1104, "01041001495", "��⵵ ������", "����Ʈ����", false);

		System.out.println("�̸� : " + l.name);
		System.out.println("�й� : " + l.id);
		System.out.println("��ȭ��ȣ : " + l.phone);
		System.out.println("�ּ� : " + l.address);
		System.out.println("�а� : " + l.department);
		System.out.println("");
		
		if(l.classPresident == true) 
			l.hello();
		else
			System.out.println("������ �ƴմϴ�");
		
		l.study();
		l.eat();
		l.test();
		l.act();
	}
}