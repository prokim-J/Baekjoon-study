package Baekjoon3;

import java.util.Scanner;

public class stage2 {
    public static void main(String[] args){
    	//A+B - 3
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        for(int i=1; i <= test; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
        	System.out.println(A+B);
            }
    }
}
