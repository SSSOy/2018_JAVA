import java.util.*;

class for_g2 {
	public static void main(String ar[]) {
		for (int i = 2; i <= 9; i ++) {
			System.out.println("-------" + i + "��-------");
			for(int j = 1; j <= 9; j++) {
				System.out.println( i + " * " + j + " = " + (i *j));
			}
		}
	}
}