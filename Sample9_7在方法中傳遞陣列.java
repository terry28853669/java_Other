//�d�ҵ{��9_7 Sample9_7.java �ܽd�p��ϥ�call by reference�b��k���ǻ��}�C
//T.Q. LEE, 2009-07-30 in Kaoshiung
class Sample9_7�b��k���ǻ��}�C {
	public static void main(String args[]) {
		int product[] = { 30, 35, 40, 45, 50, 50, 30, 40, 45, 35 };
		totalOfProduction(product);
		avgOfProduction(product);
	}

	public static void totalOfProduction(int tp[]) {
		int total = 0;
		for (int i = 0; i < tp.length; i++)
			total = total + tp[i];
		System.out.println("���~ī�G�`���q���G" + total);
	}

	public static void avgOfProduction(int ap[]) {
		int total = 0;
		for (int i = 0; i < ap.length; i++)
			total = total + ap[i];
		System.out.println("���~ī�G�������q���G" + total / ap.length);
	}
}
