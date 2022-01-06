package Baekjoon5;

import java.util.Scanner;

public class stage5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int Max = 0;
		double Sum = 0;
		
		//MAX 값과 각 배열 수를 입력받는 함수
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if(Max < arr[i]) {
				Max = arr[i];
			}
		}
		
		//각 배열의 수 마다 (/ MAX * 100) 해주는 함수
		for(int i = 0; i < arr.length; i++) {	
			Sum += ((double)arr[i] / (double)Max) * 100;
		}
		System.out.println(Sum/N);
	}
}
