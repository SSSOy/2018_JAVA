class Array_Test11 {
	public static void main(String ar[]) {
		int a[] = {10, 9, 8, 6, 7, 5};
		int temp;
		
		System.out.println("--------------------정렬 전--------------------");
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
		System.out.println("");

		for(int i = 0; i < a.length; i++){
			for(int j = i + 1; j < a.length; j++){
				if(a[i] > a[j]){
					temp = a[ i ];
					a[ i ] = a[ j ];
					a[ j ] = temp;
				}
			}
		}

		System.out.println("--------------------정렬 후--------------------");
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
		System.out.println("");
	}
}