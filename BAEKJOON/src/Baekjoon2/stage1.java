package Baekjoon2;

import java.util.Scanner;

public class stage1 {

	public static void main(String[] args) {
		// �� �� ���ϱ�
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a > b) System.out.println(">");
        if(a < b) System.out.println("<");
        if(a == b) System.out.println("==");
	}

}
