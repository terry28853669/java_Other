//範例程式9_4 Sample9_4.java 示範如何使用陣列的長度
//T.Q. LEE, 2009-07-26 in Kaoshiung
class Sample9_4如何使用陣列的長度 {
	public static void main(String args[]) {
		int total = 0;
		int product[] = { 30, 35, 40, 45, 50, 50, 30, 40, 45, 35 };
		for (int i = 0; i < product.length; i++)
			total = total + product[i];
		System.out.println("今年蘋果的總產量為：" + total);
		System.out.println("今年蘋果的總平均產量為：" + total / product.length);
	}
}
