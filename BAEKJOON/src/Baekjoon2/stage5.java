package Baekjoon2;

import java.util.Scanner;

public class stage5 {
	public static void main(String[] args) {
	    // �˶� �ð�
		Scanner in = new Scanner(System.in);
		int H = in.nextInt(); // ��
		int M = in.nextInt(); // ��
		in.close();
		
		if(M < 45) {
			H--;		// ��(hour) 1 ����
			M= 60 - (45 - M); 	// ��(min) ����
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
	}
}