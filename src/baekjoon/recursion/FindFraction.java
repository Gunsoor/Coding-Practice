package baekjoon.recursion;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1193
public class FindFraction {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int maxNum = 0; // 대각선에서 최대 수
		int cnt = 0; // 대각선 수
		int locate = 0; // 대각선에서 몇번째 위치했는가
		String answer = "";
		for(int i=1; maxNum < input; ++i) {
			maxNum += i;
			++cnt;
		}
		locate = input - maxNum + cnt;

		if(cnt%2 == 0) {
			// 짝수 down 홀수 up
			answer += (cnt -(cnt-locate)) + "/" + ((cnt-locate)+1);
		} else {
			answer += ((cnt-locate)+1) + "/" + (cnt -(cnt-locate));
		}
		System.out.println(answer);
	}
}



