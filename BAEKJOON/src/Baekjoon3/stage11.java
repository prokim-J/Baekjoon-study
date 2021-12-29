package Baekjoon3;

import java.util.Scanner;

public class stage11 {

	public static void main(String[] args) {
		//X 보다 작은 수
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		for(int i=1; i<=N; i++) {	
			int A = sc.nextInt();
			
			if(X > A) {
				System.out.print(A+" ");
			}
		}
	}
}
