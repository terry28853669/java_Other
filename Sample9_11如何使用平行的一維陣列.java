//�d�ҵ{��9_11 Sample9_11.java �ܽd�p��ϥΥ��檺�@���}�C
//T.Q. LEE, 2009-07-30 in Kaoshiung
class Sample9_11�p��ϥΥ��檺�@���}�C {
	public static void main(String args[]) {
		int studentID[] = { 1001, 1002, 1003, 1004 };
		int score[] = { 90, 100, 70, 60 };
		// ��ܥ��ƧǪ����G
		for (int k = 0; k < score.length; k++) {
			System.out.println("�Ǹ�" + studentID[k] + "�����ƬO" + score[k] + "��");
		}
		// �ƧǪ��j��
		for (int i = 0; i < score.length - 1; i++) { // �@���� score.length-1 ��
			for (int j = 0; j < score.length - i - 1; j++) {
				if (score[j] < score[j + 1]) {
					int temp1 = score[j]; // �Nscore[j] �P score[i] ���
					score[j] = score[j + 1];
					score[j + 1] = temp1;
					int temp2 = studentID[j]; // �NstudentID[j] �P studentID[i] ���
					studentID[j] = studentID[j + 1];
					studentID[j + 1] = temp2;
				}
			}
		}
		// ��ܱƧǪ����G
		System.out.println();
		System.out.println("��ܱƧǪ����G(�Ѱ�����C��)");
		System.out.println("---------------------");
		for (int k = 0; k < score.length; k++) {
			System.out.println("�Ǹ�" + studentID[k] + "�����ƬO" + score[k] + "��");
		}
	}
}
