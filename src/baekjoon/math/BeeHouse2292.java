package baekjoon.math;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2292
public class BeeHouse2292 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		int cnt = 1;
		int number = 6;
		
		while(input > 1) {
			input -= number;
			number += 6;
			++cnt;
		}
		System.out.println(cnt);
		
	}
}
