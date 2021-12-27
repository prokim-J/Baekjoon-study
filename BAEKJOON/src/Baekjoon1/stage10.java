package Baekjoon1;

import java.util.Scanner;

public class stage10 {

	public static void main(String[] args) {
		// ³ª¸ÓÁö
		Scanner sc = new Scanner(System.in);
		int A, B, C;
		A = sc.nextInt();
		B = sc.nextInt();
        C = sc.nextInt();

		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
	}
}
