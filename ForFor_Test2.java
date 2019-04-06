class ForFor_Test2 {
	public static void main(String ar[]) {
		for(int a = 1; a <= 9; a++) {
			for(int b = 1; b <= 9; b++) {
				if(a + b == 14) {
					System.out.println("a = " + a);
					System.out.println("b = "+ b);
					System.out.println("----------");
				}
			}
		}
	}
}