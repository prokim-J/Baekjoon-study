package Baekjoon4;

import java.util.Scanner;

public class stage1 {
	public static void main(String[] args){
		//A+B - 5
	    Scanner sc = new Scanner(System.in);
	    int A, B;
	    while(true) {
	    	A = sc.nextInt();
	    	B = sc.nextInt();
	    	if(A == 0 && B == 0) {
	    		break;
	    	}
	    	System.out.println(A + B);
	    }
	    sc.close();
	}
}
