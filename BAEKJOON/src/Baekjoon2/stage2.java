package Baekjoon2;

import java.util.Scanner;

public class stage2 {
    public static void main(String[] args) {
    	// �б� ����
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if(a >= 90){
           System.out.println("A"); 
        }else if(a >= 80){
           System.out.println("B");
        }else if(a >= 70){
           System.out.println("C");
        }else if(a >= 60){
           System.out.println("D");
        }else if(a <= 50){
           System.out.println("F");
        }else{
           System.out.println("F");
        }
    }
}
