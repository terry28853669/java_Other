//Problem�d�ҵ{��9-1 Problem9_1.java �ϥΰ}�C�Afor�j��P�_10�����Z���h�ֵ��ή�H�Φ��h�ֵ����ή�
//T.Q. LEE, 2009-07-31 in Kaoshiung
import java.io.*;

public class Problem9_1���Z���h�ֵ��ή� {
	public static void main(String args[]) throws IOException {
		int grade[] = new int[10];
		int passFail[] = { 0, 0 };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i <= grade.length - 1; i++) {
			System.out.println("�п�J1�����Z");
			grade[i] = Integer.parseInt(br.readLine());
		}
		checkScore(grade, passFail);
		System.out.println(passFail[0] + "�����Z�ή�A" + passFail[1] + "�����Z���ή�");
	}

	static void checkScore(int score[], int count[]) {// �w�q�@��void��kcheckScore()
		for (int i = 0; i <= score.length - 1; i++) {
			if (score[i] >= 60)
				count[0] = count[0] + 1;
			else
				count[1] = count[1] + 1;
		}
	}
}
