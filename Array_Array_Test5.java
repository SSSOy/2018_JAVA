import java.util.*;

class Array_Array_Test5 {
	public static void main(String ar[]) {	
		Random r = new Random();
		int a[ ][ ] = new int[4][3];

		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				a[i][j] = r.nextInt(100);
				System.out.print(a[ i ][ j ] + "\t");
			}
			System.out.println("");
		}
	}
}