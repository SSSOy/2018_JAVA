// 회사에 근무하는 직원들을 나타내는 클래스들을 상속을 이용하여 작성 

class Employee {
	String name, num;
	
	Employee(String name, String num) {
		this.name = name;
		this.num = num;
	}
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	void setNum(String num) {
		this.num = num;
	}
	String getNum() {
		return num;
	}
	void computeSalary() { //100*12개월
		System.out.println("Salary : " + 100*12);
	}
}

class SalariedEmployee extends Employee {
	double salary;
	
	public SalariedEmployee(String name, String num, double salary) {
		super(name, num);
		this.salary = salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void computeSalary() {
		System.out.println("Salary : " + salary*(float)12);
	}
}

public class extend_Test6 {
	public static void main(String[] args) {
		Employee e01 = new Employee("Sam", "01");
		SalariedEmployee e02 = new SalariedEmployee("Bob", "02", 230);
		
		System.out.println("Name : " + e01.getName());
		System.out.println("Num : " + e01.getNum());
		e01.computeSalary();
		System.out.println("");

		
		System.out.println("Name : " + e02.getName());
		System.out.println("Num : " + e02.getNum());
		e02.computeSalary();

	}
}