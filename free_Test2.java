class free_Test2 {
	public static void main(String ar[]) {
		int n[ ] = new int[ 100 ];
		int j = 0;
		
		for(int i = 0; i < n.length; i++) {
			n[ i ] = i + 1;
			if(n[ i ] % 4 == 0){
				System.out.print(n[ i ] + "\t");
				j++;
			}	
			if(j % 8 == 0)
				System.out.println("");
		}
	}
}