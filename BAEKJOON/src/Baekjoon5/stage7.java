package Baekjoon5;

import java.util.Scanner;
public class stage7 {
	public static void main(String[] args) {
		// 평균 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int N2 = sc.nextInt(); // 학생수
			int score[] = new int[N2]; // 학생들의 점수를 저장할 배열 변수
			int Sum = 0;
			int count = 0;
			double arg = 0;
			
			for(int j = 0; j < N2; j++) {
				score[j] = sc.nextInt(); // 학생들의 점수
				Sum += score[j]; // 학생들의 점수 누적 총 점수
			}
			
			arg = (double)Sum/N2; // 학생들의 평균
			
			for(int j = 0; j < N; j++) {	
				if(score[j]>arg) {
					count++; // 평균점수보다 높은 학생 수 카운트
				}
			}
			double p = (double)count/(double)N2; //평균점수보다 높은 학생의 비율
			System.out.println(String.format("%.3f", p*100)+"%");
		}		
	}
}
