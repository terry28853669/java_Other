//�d�ҵ{��9_10 Sample9_10.java �ܽd�p��ϥΤG���j�M�k�j�M�}�C����
//T.Q. LEE, 2009-07-30 in Kaoshiung
import java.io.*;

class Sample9_10�ϥΤG���j�M�k�j�M�}�C���� {
	public static void main(String args[]) throws IOException {
		int[] list = new int[10];
		for (int i = 0; i < list.length; i++)
			// �H������10�ӼơA��Jlist��
			list[i] = (int) (Math.random() * 1000);
		bubbleSort(list); // �Nlist�Ѥp��j�ƦC
		System.out.println("�Ƨǫ᪺���: ");
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + "  ");
		System.out.println("\n�п�J�n�䪺��: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int number = Integer.parseInt(str);
		int index = binarySearch(number, list);// �I�s�G���j�M�k�A�^�ǭȬ��������Ҧb��m
		if (index != -1)
			System.out.println("�������b " + index + " ����m");
		else
			System.out.println("�L�k��즹����");
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

	public static void bubbleSort(int b[]) { // �N��ƱƦC
		for (int pass = 1; pass < b.length; pass++)
			for (int i = 0; i < b.length - 1; i++)
				if (b[i] > b[i + 1])
					swap(b, i, i + 1);
	}// buble sort

	public static void swap(int c[], int first, int second) { // �N��ƹ��
		int hold;
		hold = c[first];
		c[first] = c[second];
		c[second] = hold;
	}
}// class