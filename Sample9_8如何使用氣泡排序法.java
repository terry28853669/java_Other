//範例程式9_8 Sample9_8.java 示範如何使用氣泡排序法將陣列的資料排序
//T.Q. LEE, 2009-07-30 in Kaoshiung
class Sample9_8如何使用氣泡排序法 {
	public static void main(String args[]) {
		int s[] = { 60, 70, 50, 90, 80 };
		// 排序的迴圈
		for (int i = 0; i < s.length-1; i++) { // 共執行 score.length-1 次
			for (int j = 0; j < s.length -i-1; j++) {
				if (s[j] < s[j + 1]) {
					int temp = s[j]; // 將score[j] 與 score[j] 對調
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
		// 顯示結果
		System.out.println("---------------------");
		for (int k = 0; k < s.length; k++) {
			System.out.println("第" + (k + 1) + "名的分數是" + s[k] + "分");
		}
	}
}
