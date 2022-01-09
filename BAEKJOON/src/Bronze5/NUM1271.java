package Bronze5;

import java.math.BigInteger; //★실수형을 확장시켜주는 BigDecimal 클래스
//=> 자릿수 부족 또는 연산에서의 부정확성 문제를 해결
import java.util.Scanner;

public class NUM1271 {

	public static void main(String[] args) {
		// 엄청난 부자 2
		Scanner sc = new Scanner(System.in);
		
		BigInteger N = sc.nextBigInteger(); // 최백준씨 돈
		BigInteger M = sc.nextBigInteger(); // 생명체 수
	
		System.out.println(N.divide(M));
		System.out.println(N.mod(M));
	}

}
