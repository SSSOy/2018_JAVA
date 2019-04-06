class Employee {
	private String  name, hiredate;
	private int salary;

	public Employee(String name, int salary, String hiredate) {
		this.name = name;
		this.salary = salary;
		this.hiredate = hiredate;
	}
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public Employee(String name, String hiredate) {
		this.name = name;
		this.hiredate = hiredate;
	}

	public void setHiredate(String hiredate){
		this.hiredate = hiredate;
	}
	public String getHiredate() {
		return this.hiredate;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
	public int getSalary() {
		return this.salary;
	}

	public static void main(String ar[])  {
		Employee e1=new Employee("mike",100,"2018-05-01");
		Employee e2=new Employee("alice",200);
		Employee e3=new Employee("Tom","2017-05-03");

		e2.setHiredate("2015-03-01");
		System.out.println("e2.hiredate : " + e2.getHiredate());
		e3.setSalary(500);
		System.out.println("e3.salary : " + e3.getSalary());
	}	
}