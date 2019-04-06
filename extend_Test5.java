class Person10 {
	String name, addr, tel;

	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	public String getTel() {
		return tel;
	}
}

class Customer extends Person10 {
	String customNum; //고객번호
	int mileage; //마일리지
	public Customer(String name, String addr, String tel, String customNum, int mileage) {
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.customNum = customNum;
		this.mileage = mileage;
	}
}
public class extend_Test5 {
	public static void main(String[] args) {
	Customer c1 = new Customer("Tom", "101-412", "#82-622-8909", "10249304", 100);

	System.out.println("Name : " + c1.getName());
	System.out.println("Addr : " + c1.getAddr());
	System.out.println("Tel : " + c1.getTel());
	System.out.println("customNum : " + c1.customNum);
	System.out.println("mileage : " + c1.mileage);
	}
}