package Baekjoon5;

import java.util.*;

public class stage1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N]; // 1���� �迭 ����
        
        for(int i=0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[N-1]);
    }
}