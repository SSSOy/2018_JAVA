//4. 2단 ~ 9단 구구단 출력

import java.util.*;

class While_Test6 {
	public static void main(String ar[]) {
		int i = 2;
		while (i <= 9) {
			int j = 1;
			while(j <= 9){
				System.out.println(i + "*" + j + "=" + (i * j));
				j++;
			}
			System.out.println("---------");
			i++;
		}
	}
}