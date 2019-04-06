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
		Member1 m1 = new Member1("소영", "BBH56", "bh0506", 17);
		Member1 m2 = new Member1();
		
		System.out.print("이름 입력 : ");
		m2.setName(sc.next());
		System.out.print("아이디 입력 : ");
		m2.setId(sc.next());
		System.out.print("비밀번호 입력 : ");
		m2.setPassword(sc.next());
		System.out.print("나이 입력 : ");
		m2.setAge(sc.nextInt());

		System.out.println("");
		System.out.println("m1의 이름 : " + m1.getName());
		System.out.println("m1의 아이디 : " + m1.getId());
		System.out.println("m1의 비밀번호 : " + m1.getPassword());
		System.out.println("m1의 나이 : " + m1.getAge());
		System.out.println("");

		System.out.println("m2의 이름 : " + m2.getName());
		System.out.println("m2의 아이디 : " + m2.getId());
		System.out.println("m2의 비밀번호 : " + m2.getPassword());
		System.out.println("m2의 나이 : " + m2.getAge());
	}
}