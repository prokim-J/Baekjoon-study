package Bronze5;

import java.math.BigInteger; //�ڽǼ����� Ȯ������ִ� BigDecimal Ŭ����
//=> �ڸ��� ���� �Ǵ� ���꿡���� ����Ȯ�� ������ �ذ�
import java.util.Scanner;

public class NUM1271 {

	public static void main(String[] args) {
		// ��û�� ���� 2
		Scanner sc = new Scanner(System.in);
		
		BigInteger N = sc.nextBigInteger(); // �ֹ��ؾ� ��
		BigInteger M = sc.nextBigInteger(); // ����ü ��
	
		System.out.println(N.divide(M));
		System.out.println(N.mod(M));
	}

}
