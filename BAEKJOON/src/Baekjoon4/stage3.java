package Baekjoon4;

import java.util.Scanner;

public class stage3 {
	public static void main(String[] args) {
		// ���ϱ� ����Ŭ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //ó�� �Է�
		sc.close();
		
		int count = 0; // �ݺ����� ��� �ݺ��Ǿ����� �����ִ� ����
		int copy = N; // ó�� �Է°��� ������ ���� copy
		
		while(true) {
			N = ((N % 10) * 10)+(((N / 10) + (N % 10)) % 10);
			count++;
			
			if(copy == N) {
				//ó�� �Է°��� ���ο� ������ ������� �ݺ��� ����
				break;
			}
		}
		System.out.println(count);
	}
}
