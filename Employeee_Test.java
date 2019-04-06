interface Employeee {
	public String work();
}
class Salesman implements Employeee {
	public String work() {
		return "일 합니다";
	}
}
class Employeee_Test {
	public static void main(String ar[]) {
		Salesman s = new Salesman();
		System.out.println(s.work());
	}
}