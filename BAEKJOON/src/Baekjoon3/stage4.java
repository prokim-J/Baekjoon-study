package Baekjoon3;

import java.io.BufferedReader; // Scanner와 유사
import java.io.BufferedWriter; // System.out.println(); 과 유사
// 둘은 모두 기존에 쓰던 Scanner와 System.out.println() 보다 속도 측면에서 훨씬 빠르기 때문에
// 많은 양의 데이터를 처리할 때 유리하다.
// ( 입력된 데이터가 바로 전달되지 않고 버퍼를 거쳐 전달되므로 데이터 처리 효율성을 높임 )
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.IOException; // 예외처리를 해주기 위해 throws IOException 임폴트
//에외처리를 해주지않으면 readLine(); 사용 불가능.

import java.util.StringTokenizer;
// Read한 데이터는 Line 단위로만 나눠지기에 공백 단위로 데이터를 가공하려면 따로 작업을 해주어야 하는데
// StringTokenizer에 nextToken() 함수를 쓰면 readLine()을 통해 입력받은 값을 공백 단위로 구분하여 순서대로 호출할 수 있다.

public class stage4 {
	public static void main(String[] args) throws IOException {
		// 빠른 A + B
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //출력
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()); //들어온 String 데이터를 Int형으로 바꿔주는것
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		
		br.close(); // BufferedWriter의 경우 버퍼를 잡아 놓았기 때문에 반드시 뒤처리를 해주어야한다
		// flush() : 남아있는 데이터를 모두 출력시킴 close() : 스트림을 닫음
	    bw.flush();
        bw.close();
	}
}
