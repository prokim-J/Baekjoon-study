package Baekjoon4;

import java.util.Scanner;

public class stage3 {
	public static void main(String[] args) {
		// 더하기 사이클
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //처음 입력
		sc.close();
		
		int count = 0; // 반복문이 몇번 반복되었는지 세어주는 변수
		int copy = N; // 처음 입력값을 복사한 변수 copy
		
		while(true) {
			N = ((N % 10) * 10)+(((N / 10) + (N % 10)) % 10);
			count++;
			
			if(copy == N) {
				//처음 입력값과 새로운 변수가 같을경우 반복문 종료
				break;
			}
		}
		System.out.println(count);
	}
}
