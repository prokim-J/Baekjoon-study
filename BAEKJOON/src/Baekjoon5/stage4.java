package Baekjoon5;

import java.util.Scanner;

public class stage4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
		int cnt = 0;
		int samecnt = 0;
		
		for(int i=0; i < array.length; i++) {
			array[i] = (sc.nextInt() % 42);
		}
		
		for(int i = 0; i < array.length; i++) { //�������� ���� 1,2,3,4,5,6,7,8,9,10
			samecnt = 0;
			for(int j=i+1; j<array.length; j++) { //��������1�� 2,3,4,5,6,7,8,9,10�� �������ִ��� �˻� �ϴ� for��
				if(array[i]==array[j]) {
					samecnt++;
				}
			}
			if(samecnt == 0) { //���������� ������ 0 ���϶� ī��Ʈ���� �ö�
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
