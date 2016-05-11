//Problem範例程式9-1 Problem9_1.java 使用陣列，for迴圈判斷10筆成績有多少筆及格以及有多少筆不及格
//T.Q. LEE, 2009-07-31 in Kaoshiung
import java.io.*;

public class Problem9_1成績有多少筆及格 {
	public static void main(String args[]) throws IOException {
		int grade[] = new int[10];
		int passFail[] = { 0, 0 };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i <= grade.length - 1; i++) {
			System.out.println("請輸入1筆成績");
			grade[i] = Integer.parseInt(br.readLine());
		}
		checkScore(grade, passFail);
		System.out.println(passFail[0] + "筆成績及格，" + passFail[1] + "筆成績不及格");
	}

	static void checkScore(int score[], int count[]) {// 定義一個void方法checkScore()
		for (int i = 0; i <= score.length - 1; i++) {
			if (score[i] >= 60)
				count[0] = count[0] + 1;
			else
				count[1] = count[1] + 1;
		}
	}
}
