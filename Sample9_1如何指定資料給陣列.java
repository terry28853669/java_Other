//範例程式9_1 Sample9_1.java 示範如何指定資料給陣列
//T.Q. LEE, 2009-07-26 in Kaoshiung
class Sample9_1如何指定資料給陣列 {
	public static void main(String args[]) {
		int grade[] = new int[5];
		grade[0] = 60; // 將成績一一指定給陣列元素儲存
		grade[1] = 65;
		grade[2] = 80;
		grade[3] = 90;
		grade[4] = 70;
		for (int i = 0; i < 5; i++)
			System.out.println("第" + (i + 1) + "個成績" + grade[i]);
		System.out.println("考試人數有5人");
	}
}
