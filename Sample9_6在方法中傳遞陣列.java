//�d�ҵ{��9_6 Sample9_6.java �ܽd�p��ϥ�call by reference�b��k���ǻ��}�C
//T.Q. LEE, 2009-07-26 in Kaoshiung
class Sample9_6�b��k���ǻ��}�C {
	public static void main(String args[]) {
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println("�}�C���쥻�������G");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		modifyArray(a);
		System.out.println("�g��call by reference�ǧ}���ܤ����G");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void modifyArray(int b[]) {
		for (int j = 0; j < b.length; j++)
			b[j] = b[j] * 2;
	}
}
