//�d�ҵ{��9_9 Sample9_9.java �ܽd�p��ϥνu�ʷj�M�k�N�ӭȦb�}�C�������ޭȧ�X��
//T.Q. LEE, 2009-07-30 in Kaoshiung
import java.io.*;

class Sample9_9�u�ʷj�M�k {
	public static void main(String args[]) throws IOException {
		int[] data = new int[10];
		System.out.print("The data is ");
		for (int i = 0; i < data.length; i++) { // �H�N���]�w10�Ӽ�
			data[i] = (int) (Math.random() * 10);
			System.out.print(data[i] + " ");
		}
		System.out.println(" ");
		System.out.print("�п�J�n�䪺��: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int number = Integer.parseInt(str);
		int index = linearSearch(number, data);
		if (index != -1)
			System.out.println("�������b " + index + " ����m");
		else
			System.out.println("�L�k��즹����");
	}

	public static int linearSearch(int number, int[] list) {
		for (int i = 0; i < list.length; i++)
			if (number == list[i])
				return i;
		return -1; // �p�G�䤣��A�N�^��-1
	}
}
