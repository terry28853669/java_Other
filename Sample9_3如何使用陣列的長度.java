//範例程式9_3 Sample9_3.java 示範如何使用陣列的長度
//T.Q. LEE, 2009-07-26 in Kaoshiung
class Sample9_3如何使用陣列的長度 {
	public static void main(String args[]) {
		int grade[] = { 60, 65, 80, 90, 70 };
		// 將5個人的考試成績指定給陣列
		for (int i = 0; i < grade.length; i++)
			System.out.println("第" + (i + 1) + "個成績" + grade[i]);
		System.out.println("考試人數有" + grade.length + "人");
	}
}
