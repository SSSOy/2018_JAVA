//±¸±¸´Ü 
class Array_Array_Test2 {
	public static void main(String ar[]) {
		int a[ ][ ] = new int[8][9];
		int n = 2;
		
		for(int i = 0; i < a.length; i++){
			int n2 = 1;
			for(int j = 0; j < a[ i ].length; j++){
				a[ i ][ j ] = n * n2;
				System.out.println(n + " * " + n2 + " = " + a[i][j]);
				n2++;
			}
			n++;
			System.out.println("-------------------");
		}
	}
}