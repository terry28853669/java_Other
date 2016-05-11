//範例程式9_11 Sample9_11.java 示範如何使用平行的一維陣列
//T.Q. LEE, 2009-07-30 in Kaoshiung
class Sample9_11如何使用平行的一維陣列 {
	public static void main(String args[]) {
		int studentID[] = { 1001, 1002, 1003, 1004 };
		int score[] = { 90, 100, 70, 60 };
		// 顯示未排序的結果
		for (int k = 0; k < score.length; k++) {
			System.out.println("學號" + studentID[k] + "的分數是" + score[k] + "分");
		}
		// 排序的迴圈
		for (int i = 0; i < score.length - 1; i++) { // 共執行 score.length-1 次
			for (int j = 0; j < score.length - i - 1; j++) {
				if (score[j] < score[j + 1]) {
					int temp1 = score[j]; // 將score[j] 與 score[i] 對調
					score[j] = score[j + 1];
					score[j + 1] = temp1;
					int temp2 = studentID[j]; // 將studentID[j] 與 studentID[i] 對調
					studentID[j] = studentID[j + 1];
					studentID[j + 1] = temp2;
				}
			}
		}
		// 顯示排序的結果
		System.out.println();
		System.out.println("顯示排序的結果(由高分到低分)");
		System.out.println("---------------------");
		for (int k = 0; k < score.length; k++) {
			System.out.println("學號" + studentID[k] + "的分數是" + score[k] + "分");
		}
	}
}
