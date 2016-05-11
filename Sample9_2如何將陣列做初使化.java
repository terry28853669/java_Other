//範例程式9_2 Sample9_2.java 示範如何將陣列做初使化
//T.Q. LEE, 2009-07-26 in Kaoshiung
class Sample9_2如何將陣列做初使化 {
	public static void main(String args[]) {
		int grade[] = { 60, 65, 80, 90, 70 };
		// 將5個人的考試成績指定給陣列
		for (int i = 0; i < 5; i++)
			System.out.println("第" + (i + 1) + "個成績" + grade[i]);
		System.out.println("考試人數有5人");
	}
}
