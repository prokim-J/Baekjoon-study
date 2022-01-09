package Bronze5;

import java.util.Scanner;
import java.math.BigInteger;

public class NUM2338 {
	public static void main(String[] args) {
		// 긴자리 계산
		Scanner sc = new Scanner(System.in);
		
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();		
		sc.close();
		
		System.out.println(A.add(B));
		System.out.println(A.subtract(B));
		System.out.println(A.multiply(B));

	}
}
