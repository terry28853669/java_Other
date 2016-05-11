//範例程式9_9 Sample9_9.java 示範如何使用線性搜尋法將該值在陣列中的索引值找出來
//T.Q. LEE, 2009-07-30 in Kaoshiung
import java.io.*;

class Sample9_9線性搜尋法 {
	public static void main(String args[]) throws IOException {
		int[] data = new int[10];
		System.out.print("The data is ");
		for (int i = 0; i < data.length; i++) { // 隨意的設定10個數
			data[i] = (int) (Math.random() * 10);
			System.out.print(data[i] + " ");
		}
		System.out.println(" ");
		System.out.print("請輸入要找的數: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int number = Integer.parseInt(str);
		int index = linearSearch(number, data);
		if (index != -1)
			System.out.println("此元素在 " + index + " 的位置");
		else
			System.out.println("無法找到此元素");
	}

	public static int linearSearch(int number, int[] list) {
		for (int i = 0; i < list.length; i++)
			if (number == list[i])
				return i;
		return -1; // 如果找不到，就回傳-1
	}
}
