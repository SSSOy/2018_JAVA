class Method_overroding_Test {	
	public void add(int x, int y){
		System.out.println(x + y);
	}
	public String add(String x, String y, String z){
		return(x + y + z);
	}
	public int add(int x, int y, int z, int w){
		return(x + y + z + w);
	}
	public static void main(String ar[]) {
		Method_overroding_Test t = new Method_overroding_Test();

		t.add(5, 3);
		System.out.println(t.add("Java","C", "Html"));
		System.out.println(t.add(3, 5, 2, 7));
	}
}