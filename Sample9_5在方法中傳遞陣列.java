//範例程式9_5 Sample9_5.java 示範如何使用call by value在方法中傳遞陣列
//T.Q. LEE, 2009-07-26 in Kaoshiung
class Sample9_5在方法中傳遞陣列 {
	public static void main(String args[]) {
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println("陣列中原本的第二個元素是: " + a[1]);
		System.out.println();
		modifyElement(a[1]);
		System.out.println("經由call by value傳值後的第二個元素是: " + a[1]);
	}

	public static void modifyElement(int b) {
		b = b * 2;
	}
}
