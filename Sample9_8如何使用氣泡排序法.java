//�d�ҵ{��9_8 Sample9_8.java �ܽd�p��ϥή�w�ƧǪk�N�}�C����ƱƧ�
//T.Q. LEE, 2009-07-30 in Kaoshiung
class Sample9_8�p��ϥή�w�ƧǪk {
	public static void main(String args[]) {
		int s[] = { 60, 70, 50, 90, 80 };
		// �ƧǪ��j��
		for (int i = 0; i < s.length-1; i++) { // �@���� score.length-1 ��
			for (int j = 0; j < s.length -i-1; j++) {
				if (s[j] < s[j + 1]) {
					int temp = s[j]; // �Nscore[j] �P score[j] ���
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
		// ��ܵ��G
		System.out.println("---------------------");
		for (int k = 0; k < s.length; k++) {
			System.out.println("��" + (k + 1) + "�W�����ƬO" + s[k] + "��");
		}
	}
}
