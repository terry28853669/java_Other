//�d�ҵ{��9_5 Sample9_5.java �ܽd�p��ϥ�call by value�b��k���ǻ��}�C
//T.Q. LEE, 2009-07-26 in Kaoshiung
class Sample9_5�b��k���ǻ��}�C {
	public static void main(String args[]) {
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println("�}�C���쥻���ĤG�Ӥ����O: " + a[1]);
		System.out.println();
		modifyElement(a[1]);
		System.out.println("�g��call by value�ǭȫ᪺�ĤG�Ӥ����O: " + a[1]);
	}

	public static void modifyElement(int b) {
		b = b * 2;
	}
}
