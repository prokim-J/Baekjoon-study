package Bronze5;

import java.util.Scanner;

/*
- Integer.parseInt(' ', 16)
16진수를 10진수로 변환
' ' 안에는 변환할 것을 넣는다. 예) A, B, C 등

- Integer.toHexString( )
10진수를 16진수로 변환
( ) 괄호 안에는 10진수를 넣는다.
 */
public class NUM1550 {
	public static void main(String[] args) {
		// 16 진수
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(Integer.parseInt(str, 16));
		
		sc.close();

	}
}
