class UnaryOperator {
 public static void main(String ar[]) {
  int opr=0;
  opr+=3;
  System.out.println(opr++);//3
  System.out.println(opr);//4
  System.out.println(++opr);//5
  System.out.println(opr);//5
  System.out.println(opr--);//5
  System.out.println(opr);//4
  System.out.println(--opr);//3
  System.out.println(opr);//3
}
}