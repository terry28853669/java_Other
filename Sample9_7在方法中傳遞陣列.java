//範例程式9_7 Sample9_7.java 示範如何使用call by reference在方法中傳遞陣列
//T.Q. LEE, 2009-07-30 in Kaoshiung
class Sample9_7在方法中傳遞陣列 {
	public static void main(String args[]) {
		int product[] = { 30, 35, 40, 45, 50, 50, 30, 40, 45, 35 };
		totalOfProduction(product);
		avgOfProduction(product);
	}

	public static void totalOfProduction(int tp[]) {
		int total = 0;
		for (int i = 0; i < tp.length; i++)
			total = total + tp[i];
		System.out.println("今年蘋果總產量為：" + total);
	}

	public static void avgOfProduction(int ap[]) {
		int total = 0;
		for (int i = 0; i < ap.length; i++)
			total = total + ap[i];
		System.out.println("今年蘋果平均產量為：" + total / ap.length);
	}
}
