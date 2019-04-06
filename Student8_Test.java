import java.util.*;

class Student8 {
	int age;
	String name, phone, skil, addr;

	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
	void setSkil(String skil) {
		this.skil = skil;
	}
	void setAddr(String addr) {
		this.addr = addr;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	String getPhone() {
		return phone;
	}
	String getSkil() {
		return skil;
	}
	String getAddr() {
		return addr;
	}
	public void print() {
		System.out.println("");
		System.out.println("�̸�	  " + this.getName());
		System.out.println("����	  " + this.getAge());
		System.out.println("��ȭ��ȣ  " + this.getPhone());
		System.out.println("��Ư��	  " + this.getSkil());
		System.out.println("�ּ�	  "+	this.getAddr());
		System.out.println("\n----------------------------------");
	}
}

class Student8_Test {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է��ο� : ");
		int n = sc.nextInt();

		Student8 s[] = new Student8[n];

		System.out.println("=====�л� �����Է�=====");
		
		for(int i = 0; i < n; i++) {
			s[i] = new Student8();
			System.out.print("�̸� : ");
			s[i].setName(sc.next());
			System.out.print("���� : ");
			s[i].setAge(sc.nextInt());
			System.out.print("��ȭ��ȣ : ");
			s[i].setPhone(sc.next());
			System.out.print("��Ư�� : ");
			s[i].setSkil(sc.next());
			System.out.print("�ּ� : ");
			s[i].setAddr(sc.next());
			System.out.println("");
		}
		System.out.println("");
		for(int i = 0; i < n; i++) 
			s[i].print();
	}
}
