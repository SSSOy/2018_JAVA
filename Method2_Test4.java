class Method2_Test4 {
	public String eo(int x) {
		if(x % 2 == 0)
			return("Â¦¼ö");
		else
			return("È¦¼ö");
	}
	public static void main(String ar[]) {
		Method2_Test4 t = new Method2_Test4();
		System.out.println(t.eo(14));
	}
}