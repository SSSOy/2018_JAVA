class free_Test4 {
	public static void main(String ar[]) {
		int n[] = new int[900];
		int co = 0, sum = 0;

		for(int i = 0; i < n.length; i++){
			n[ i ] = i + 100;
			if(n[ i ] % 4 != 0){
				sum += n[ i ];
				co++;
			}
		}
		System.out.println("°³¼ö : " + co);
		System.out.println("ÇÕ : " + sum);
	}
}