//Problem�d�ҵ{��9-2 Problem9_2.java �ϥΰ}�C�A��k��X4����ƭȪ��̤j��
//T.Q. LEE, 2009-07-31 in Kaoshiung
import java.io.*;

public class Problem9_2��X4����ƭȪ��̤j�� {
	public static void main(String args[]) throws IOException {
		int max = 0;
		int num[] = new int[4];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i <= num.length - 1; i++) {
			System.out.println("�п�J " + (i + 1) + " ����ƭ�");
			num[i] = Integer.parseInt(br.readLine());
		}
		max = maxOfNumber(num);// ��X2����ƭȪ��̤j��
		System.out.println("�̤j�Ȭ��G " + max);
	}

	static int maxOfNumber(int x[]) {// �w�q�@��static��kmaxOfNumber()
		int largest = 0;
		for (int i = 0; i <= x.length - 1; i++) {
			if (x[i] > largest)
				largest = x[i];
		}
		return largest;
	}
}
