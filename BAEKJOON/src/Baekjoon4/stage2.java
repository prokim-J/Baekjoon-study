package Baekjoon4;

import java.util.Scanner;

public class stage2 {
	public static void main(String[] args) {
		//A+B - 4
		Scanner sc = new Scanner(System.in);
		// hasNextInt()�� ����Ͽ� ���� ������ ������־�� �Ѵ�.
		// hasNextInt()�� ������ �Է°��� �����ϰ�� true�� ��ȯ�ϰ�
		// ������ �ƴҰ�� �ٷ� ���ܸ� ������ ���̻� �Է��� ���� �ʰ� false�� ��ȯ�ϱ� ������
		// �ݺ����� ����ȴ�.
		while(sc.hasNextInt()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A + B);
		}
		sc.close();
	}
}
