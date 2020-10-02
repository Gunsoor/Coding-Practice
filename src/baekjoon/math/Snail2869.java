package baekjoon.math;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2869
public class Snail2869 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int v = scan.nextInt();
		
		int upToDay = a-b;
		int answer = (int)(Math.ceil((double)(v-a)/upToDay)) + 1;
		if(a == v) answer = 1;
		
		// 마지막에 올라가는날을 빼고 하루에올라가는날을 나눈다.
		// 5 2 18 일 경우
		// 18 - 5 = 13
		// 13 / 3(upToDay) = 4.3333
		// 소숫점이나온다면 무조건 올림
		// 그럼 13층을 올라가기위해 5 일이 소모되고, 뺐던 하루를 더해준다.
		// 즉 5 2 18일 경우 6일이 소모된다.
		
		System.out.println(answer);
	}
}
