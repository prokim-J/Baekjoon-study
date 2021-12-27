package Baekjoon2;

import java.util.Scanner;

public class stage4 {
    public static void main(String[] args){
    	// 사분면 고르기
	    Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    
		if(x > 0) {
			if(y > 0) {
				System.out.print(1);
			} 
			else {
				System.out.print(4);
			}
		} 
		
		else {
			if(y > 0) {
				System.out.print(2);
			} 
			else {
				System.out.print(3);
			}
		}
	}
}
