class Method2_Test4 {
	public String eo(int x) {
		if(x % 2 == 0)
			return("¦��");
		else
			return("Ȧ��");
	}
	public static void main(String ar[]) {
		Method2_Test4 t = new Method2_Test4();
		System.out.println(t.eo(14));
	}
}