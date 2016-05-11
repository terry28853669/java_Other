import java.util.Arrays;

public class 排序 {
	public static void main(String args[]) {
		int s[] = { 60, 70, 50, 90, 80 };
		// 排序的迴圈
		Arrays.sort(s);
		// 顯示結果
		System.out.println("---------------------");
		for (int k = s.length - 1; k >= 0; k--) {
			System.out.println("第" + (s.length - k) + "名的分數是" + s[k] + "分");
		}
	}
}