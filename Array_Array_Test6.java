//성적처리 프로그램
import java.util.*;

class Array_Array_Test6 {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);

		String a[] = {"학번", "국어", "영어", "수학"};
		int student[][] = new int[5][4];
		int total[] = new int[5];
		float avg[] = new float[5];

		for(int i = 0; i < student.length; i++){
			for(int j = 0; j < student[i].length; j++){
				System.out.print(a[j] + " 입력 : ");
				student[i][j] = sc.nextInt();
			}
		System.out.println("");
		}
		
		for(int i = 0; i < total.length; i++){
			for(int j = 1; j < student[i].length; j++)
				total[i] += student[i][j];
			avg[i] = (float)total[i] / 3;
		}

		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("====================================================");
		for(int i = 0; i < student.length; i++){
			for(int j = 0; j < student[i].length; j++)
				System.out.print(student[i][j] + "\t");
			System.out.print(total[i] + "\t" + avg[i]);
			System.out.println("");
		}
	}
}