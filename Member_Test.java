import java.util.*;

class Member1 {
	private String name, id, password;
	private int age;
	
	public Member1() { }
	public Member1(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public String getId() {
		return this.id;
	}
	public String getPassword() {
		return this.password;
	}
	public int getAge() {
		return this.age;
	}
}

class Member_Test {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		Member1 m1 = new Member1("�ҿ�", "BBH56", "bh0506", 17);
		Member1 m2 = new Member1();
		
		System.out.print("�̸� �Է� : ");
		m2.setName(sc.next());
		System.out.print("���̵� �Է� : ");
		m2.setId(sc.next());
		System.out.print("��й�ȣ �Է� : ");
		m2.setPassword(sc.next());
		System.out.print("���� �Է� : ");
		m2.setAge(sc.nextInt());

		System.out.println("");
		System.out.println("m1�� �̸� : " + m1.getName());
		System.out.println("m1�� ���̵� : " + m1.getId());
		System.out.println("m1�� ��й�ȣ : " + m1.getPassword());
		System.out.println("m1�� ���� : " + m1.getAge());
		System.out.println("");

		System.out.println("m2�� �̸� : " + m2.getName());
		System.out.println("m2�� ���̵� : " + m2.getId());
		System.out.println("m2�� ��й�ȣ : " + m2.getPassword());
		System.out.println("m2�� ���� : " + m2.getAge());
	}
}