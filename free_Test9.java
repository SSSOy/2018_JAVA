class free_Test9 {
	public static void main(String ar[]) {
		int n = Integer.parseInt(ar[0]);
		int m = Integer.parseInt(ar[1]);
		int temp;

		if(n > m){
			temp = n;
			n = m;
			m = temp;
		}
		for(int i = n; i <= m; i++)
			System.out.print(i + "   ");
	}
}