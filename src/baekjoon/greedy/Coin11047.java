package baekjoon.greedy;

import java.util.*;
//https://www.acmicpc.net/problem/11047

public class Coin11047 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] coin = new int[N];
		
		for(int i=0; i<N; ++i) {
			coin[i] = scan.nextInt();
		}
		
		int answer=0;
		
		for(int i=N-1; i>=0;) {
			if(coin[i] <= K) {
				K -= coin[i];
				++answer;
			}
			else
				--i;
			
		}
		System.out.println(answer);
	}
}
