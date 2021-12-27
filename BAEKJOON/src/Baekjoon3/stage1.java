package Baekjoon3;

import java.util.Scanner;

public class stage1 {
    public static void main(String[] args) {
     // ±¸±¸´Ü
   	 Scanner sc = new Scanner(System.in);
   	 int n1 = sc.nextInt();
   	 int n2;
   	 int sum = 0;
   	        
   	 for(n2=1; n2 <= 9; n2++){    		
   	    sum = n1 * n2;
   	    System.out.println(n1+" * "+n2+" = "+sum);
   	 }
   }
}
