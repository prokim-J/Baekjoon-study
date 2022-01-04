package Baekjoon5;

import java.util.Scanner;

public class stage2 {
	public static void main(String[] args) {
		// ÃÖ´ñ°ª
		Scanner sc = new Scanner(System.in);
		int[] arr = { sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt(), sc.nextInt() };
		sc.close();
		
		int max = 0;
		int cnt = 0;
		int i;
		
		for(i = 0; i < 9; i++) {			
			if(arr[i] > max) {
				max = arr[i];
				cnt = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(cnt);
	}
}
