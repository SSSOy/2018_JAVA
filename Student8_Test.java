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
		System.out.println("이름	  " + this.getName());
		System.out.println("나이	  " + this.getAge());
		System.out.println("전화번호  " + this.getPhone());
		System.out.println("주특기	  " + this.getSkil());
		System.out.println("주소	  "+	this.getAddr());
		System.out.println("\n----------------------------------");
	}
}

class Student8_Test {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력인원 : ");
		int n = sc.nextInt();

		Student8 s[] = new Student8[n];

		System.out.println("=====학생 정보입력=====");
		
		for(int i = 0; i < n; i++) {
			s[i] = new Student8();
			System.out.print("이름 : ");
			s[i].setName(sc.next());
			System.out.print("나이 : ");
			s[i].setAge(sc.nextInt());
			System.out.print("전화번호 : ");
			s[i].setPhone(sc.next());
			System.out.print("주특기 : ");
			s[i].setSkil(sc.next());
			System.out.print("주소 : ");
			s[i].setAddr(sc.next());
			System.out.println("");
		}
		System.out.println("");
		for(int i = 0; i < n; i++) 
			s[i].print();
	}
}
