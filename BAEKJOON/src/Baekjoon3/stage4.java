package Baekjoon3;

import java.io.BufferedReader; // Scanner�� ����
import java.io.BufferedWriter; // System.out.println(); �� ����
// ���� ��� ������ ���� Scanner�� System.out.println() ���� �ӵ� ���鿡�� �ξ� ������ ������
// ���� ���� �����͸� ó���� �� �����ϴ�.
// ( �Էµ� �����Ͱ� �ٷ� ���޵��� �ʰ� ���۸� ���� ���޵ǹǷ� ������ ó�� ȿ������ ���� )
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.IOException; // ����ó���� ���ֱ� ���� throws IOException ����Ʈ
//����ó���� ������������ readLine(); ��� �Ұ���.

import java.util.StringTokenizer;
// Read�� �����ʹ� Line �����θ� �������⿡ ���� ������ �����͸� �����Ϸ��� ���� �۾��� ���־�� �ϴµ�
// StringTokenizer�� nextToken() �Լ��� ���� readLine()�� ���� �Է¹��� ���� ���� ������ �����Ͽ� ������� ȣ���� �� �ִ�.

public class stage4 {
	public static void main(String[] args) throws IOException {
		// ���� A + B
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //���
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()); //���� String �����͸� Int������ �ٲ��ִ°�
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		
		br.close(); // BufferedWriter�� ��� ���۸� ��� ���ұ� ������ �ݵ�� ��ó���� ���־���Ѵ�
		// flush() : �����ִ� �����͸� ��� ��½�Ŵ close() : ��Ʈ���� ����
	    bw.flush();
        bw.close();
	}
}
