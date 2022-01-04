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
		
		for(int i = 0; i < array.length; i++) { //나머지값 저장 1,2,3,4,5,6,7,8,9,10
			samecnt = 0;
			for(int j=i+1; j<array.length; j++) { //나머지값1과 2,3,4,5,6,7,8,9,10과 같은게있는지 검사 하는 for문
				if(array[i]==array[j]) {
					samecnt++;
				}
			}
			if(samecnt == 0) { //나머지값이 같은게 0 개일때 카운트값이 올라감
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
