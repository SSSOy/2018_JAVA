interface Employeee {
	public String work();
}
class Salesman implements Employeee {
	public String work() {
		return "�� �մϴ�";
	}
}
class Employeee_Test {
	public static void main(String ar[]) {
		Salesman s = new Salesman();
		System.out.println(s.work());
	}
}