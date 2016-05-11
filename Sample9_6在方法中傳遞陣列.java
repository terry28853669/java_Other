//範例程式9_6 Sample9_6.java 示範如何使用call by reference在方法中傳遞陣列
//T.Q. LEE, 2009-07-26 in Kaoshiung
class Sample9_6在方法中傳遞陣列 {
	public static void main(String args[]) {
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println("陣列中原本的元素：");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		modifyArray(a);
		System.out.println("經由call by reference傳址改變元素：");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void modifyArray(int b[]) {
		for (int j = 0; j < b.length; j++)
			b[j] = b[j] * 2;
	}
}
