//3.6.9 ∞‘¿”
class Array_Test12 {
	public static void main(String ar[]){
		int a[] = new int[100];
		int b, c;
		for(int i = 0; i < a.length; i++)
			a[ i ] = i + 1;
		
		for(int i = 0; i < a.length; i++) {
			b = a[i] / 10;
			c = a[i] % 10;
			
			if(b == 3 || b == 6 || b == 9){
				if(c == 3 || c == 6 || c == 9)
					System.out.println(a[ i ] + "\tπ⁄ºˆ ¬¶¬¶");
				else
					System.out.println(a[ i ] + "\tπ⁄ºˆ ¬¶");
			}
			else if(c == 3 || c == 6 || c == 9)
				System.out.println(a[ i ] + "\tπ⁄ºˆ ¬¶");
		}
	}
}