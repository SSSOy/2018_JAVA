class Father {
	int i = 100;
	String method2() {
		String s = "아빠메서드";
		return s;
	}
}
class son2 extends Father {
	int i = 200; 
	public int method1() {
		return super.i;
	}
	public String method2() {
		return super.method2();
	}
	public static void main(String ar[]) {
		son2 s = new son2();
		System.out.println(s.method1());
		System.out.println(s.method2());
	}
}
//100, 아빠메서드 