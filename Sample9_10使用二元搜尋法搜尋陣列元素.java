//範例程式9_10 Sample9_10.java 示範如何使用二元搜尋法搜尋陣列元素
//T.Q. LEE, 2009-07-30 in Kaoshiung
import java.io.*;

class Sample9_10使用二元搜尋法搜尋陣列元素 {
	public static void main(String args[]) throws IOException {
		int[] list = new int[10];
		for (int i = 0; i < list.length; i++)
			// 隨機產生10個數，放入list中
			list[i] = (int) (Math.random() * 1000);
		bubbleSort(list); // 將list由小到大排列
		System.out.println("排序後的資料: ");
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + "  ");
		System.out.println("\n請輸入要找的數: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int number = Integer.parseInt(str);
		int index = binarySearch(number, list);// 呼叫二元搜尋法，回傳值為元素的所在位置
		if (index != -1)
			System.out.println("此元素在 " + index + " 的位置");
		else
			System.out.println("無法找到此元素");
	}

	public static int binarySearch(int x, int a[]) {
		int low = 0, high = a.length - 1, middle;
		while (low <= high) {
			middle = (low + high) / 2;
			if (x == a[middle])
				return middle;
			else if (x < a[middle])
				high = middle - 1;
			else
				low = middle + 1;
		}
		return -1;
	}

	public static void bubbleSort(int b[]) { // 將資料排列
		for (int pass = 1; pass < b.length; pass++)
			for (int i = 0; i < b.length - 1; i++)
				if (b[i] > b[i + 1])
					swap(b, i, i + 1);
	}// buble sort

	public static void swap(int c[], int first, int second) { // 將資料對調
		int hold;
		hold = c[first];
		c[first] = c[second];
		c[second] = hold;
	}
}// class