package baekjoon.math;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2839
public class SugarDelivery2839 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int cnt = 0;
		while(input > 0) {
			if(input >= 5) {
				if(input == 6) {
					input -= 3;
				} else if(input == 9) {
					input -= 3;
				} else if(input == 12) {
					input -= 3;
				} else {
					input -= 5;	
				}
				++cnt;
			} else if(input >= 3) {
				input -= 3;
				++cnt;
			} else {
				break;
			}
		}
		if(input != 0) {
			cnt = -1;
		}
		System.out.println(cnt);
	}		
}
