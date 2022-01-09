package Bronze5;

import java.io.BufferedReader; // Scanner와 유사
import java.io.BufferedWriter; // System.out.println()과 유사
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class NUM2558 {

	public static void main(String[] args) throws IOException {
		// A+B - 2 (최적화 출력)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		int A = Integer.parseInt(br.readLine()); //Int
		int B = Integer.parseInt(br.readLine()); //Int
		
		System.out.println(A+B);
		br.close();
	}
}
