package level2;

import java.util.Scanner;

/**
 * �Էµ� �ð����� 45�� ���� �˶� ����
 * <p>
 * 0 �� H �� 23, 0 �� M �� 59
 * 
 * @author bhd44
 *
 */
public class q2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, m; // �ð�, ��
		h = sc.nextInt();
		m = sc.nextInt();

		int mm = ((h + 24) * 60) + m - 45;
		int resultH = (mm / 60) % 24;
		int resultM = mm % 60;

		System.out.println(resultH + " " + resultM);

	}
}
