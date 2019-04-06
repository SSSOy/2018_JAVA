class Param_Test7 {
	public static void main(String ar[]){
		int a[ ] = new int[ 5 ];
	
		for(int i = 0; i < a.length; i++){
			a[ i ] = Integer.parseInt(ar[ i ]);

			if(a[ i ] > 0)
				System.out.println("양수 입니다.");
			else if(a[ i ] < 0)
				System.out.println("음수 입니다.");
			else
				System.out.println("0 입니다.");
		}
	}
}

