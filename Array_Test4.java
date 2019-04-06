import java.util.*;

class Array_Test4 {
	public static void main(String ar[]) {
		int arr[];
		arr = new int[ 5 ];
		for(int i = 0; i < arr.length; i++){
			arr[i] = i+1;
		}

		System.out.println("arrÀÇ Å©±â : " + arr.length);

		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] +"  ");
		}
		System.out.println("");
		System.out.println("arr = " + arr);
	}
}