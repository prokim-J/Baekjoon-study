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
				if(str.charAt(j) == 'O'){ //charAt(j)�� ���ؼ� ù ��°�� ���� O�� �Ǹ� count�� �������ְ�, �������� ���� sum ������ �� �����ش�.		
					cnt++;
					sum += cnt; // 1+2+3+4 ... ���� ���� sum
				}else {
					cnt=0;
				}
			}
			System.out.println(sum);
		}
	}
}
