import java.util.Arrays;

public class �Ƨ� {
	public static void main(String args[]) {
		int s[] = { 60, 70, 50, 90, 80 };
		// �ƧǪ��j��
		Arrays.sort(s);
		// ��ܵ��G
		System.out.println("---------------------");
		for (int k = s.length - 1; k >= 0; k--) {
			System.out.println("��" + (s.length - k) + "�W�����ƬO" + s[k] + "��");
		}
	}
}