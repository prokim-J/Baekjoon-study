package Bronze5;

import java.util.Scanner;

public class NUM2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
		int Sum = 0;
		int Su = 0;
		
		for(int i = 0; i < arr.length; i++) {
			Sum += arr[i]*arr[i];
			Su = Sum % 10;
		}
		System.out.println(Su);
	}
}
