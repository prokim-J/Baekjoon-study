package Baekjoon1;

import java.util.Scanner;

public class stage8 {
	public static void main(String[] args) {
        int A = 0;
        int B = 0;
        
        Scanner test = new Scanner(System.in);
        A = test.nextInt();
        B = test.nextInt();
        
        System.out.println((double)A/B);
        test.close();
	}
}
