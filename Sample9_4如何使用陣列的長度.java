//�d�ҵ{��9_4 Sample9_4.java �ܽd�p��ϥΰ}�C������
//T.Q. LEE, 2009-07-26 in Kaoshiung
class Sample9_4�p��ϥΰ}�C������ {
	public static void main(String args[]) {
		int total = 0;
		int product[] = { 30, 35, 40, 45, 50, 50, 30, 40, 45, 35 };
		for (int i = 0; i < product.length; i++)
			total = total + product[i];
		System.out.println("���~ī�G���`���q���G" + total);
		System.out.println("���~ī�G���`�������q���G" + total / product.length);
	}
}
