package Baekjoon5;

import java.util.Scanner;
public class stage7 {
	public static void main(String[] args) {
		// ��� 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int N2 = sc.nextInt(); // �л���
			int score[] = new int[N2]; // �л����� ������ ������ �迭 ����
			int Sum = 0;
			int count = 0;
			double arg = 0;
			
			for(int j = 0; j < N2; j++) {
				score[j] = sc.nextInt(); // �л����� ����
				Sum += score[j]; // �л����� ���� ���� �� ����
			}
			
			arg = (double)Sum/N2; // �л����� ���
			
			for(int j = 0; j < N; j++) {	
				if(score[j]>arg) {
					count++; // ����������� ���� �л� �� ī��Ʈ
				}
			}
			double p = (double)count/(double)N2; //����������� ���� �л��� ����
			System.out.println(String.format("%.3f", p*100)+"%");
		}		
	}
}
