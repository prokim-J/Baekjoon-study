package Baekjoon3;

import java.util.Scanner;

public class stage3 {
	public static void main(String[] args) {
		//합 ( 입력값이 주어졌을때 입력값 까지의 모든 합을 구하라.)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
