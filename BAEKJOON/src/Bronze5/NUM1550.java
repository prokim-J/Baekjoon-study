package Bronze5;

import java.util.Scanner;

/*
- Integer.parseInt(' ', 16)
16������ 10������ ��ȯ
' ' �ȿ��� ��ȯ�� ���� �ִ´�. ��) A, B, C ��

- Integer.toHexString( )
10������ 16������ ��ȯ
( ) ��ȣ �ȿ��� 10������ �ִ´�.
 */
public class NUM1550 {
	public static void main(String[] args) {
		// 16 ����
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(Integer.parseInt(str, 16));
		
		sc.close();

	}
}
