package Baekjoon5;

import java.util.Scanner;

public class stage6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String[] arr = new String[sc.nextInt()];
		String str;
		
		for(int i= 0; i < arr.length; i++) {
			arr[i] = sc.next();
			str = arr[i];
			int cnt = 0;
			int sum = 0;
		
			for(int j=0; j < arr[i].length(); j++) {
				if(str.charAt(j) == 'O'){ //charAt(j)를 통해서 첫 번째의 값이 O가 되면 count를 증가해주고, 증가해준 값을 sum 변수에 또 더해준다.		
					cnt++;
					sum += cnt; // 1+2+3+4 ... 누적 변수 sum
				}else {
					cnt=0;
				}
			}
			System.out.println(sum);
		}
	}
}
