//Problem範例程式9-2 Problem9_2.java 使用陣列，方法找出4筆整數值的最大值
//T.Q. LEE, 2009-07-31 in Kaoshiung
import java.io.*;

public class Problem9_2找出4筆整數值的最大值 {
	public static void main(String args[]) throws IOException {
		int max = 0;
		int num[] = new int[4];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i <= num.length - 1; i++) {
			System.out.println("請輸入 " + (i + 1) + " 筆整數值");
			num[i] = Integer.parseInt(br.readLine());
		}
		max = maxOfNumber(num);// 找出2筆整數值的最大值
		System.out.println("最大值為： " + max);
	}

	static int maxOfNumber(int x[]) {// 定義一個static方法maxOfNumber()
		int largest = 0;
		for (int i = 0; i <= x.length - 1; i++) {
			if (x[i] > largest)
				largest = x[i];
		}
		return largest;
	}
}
