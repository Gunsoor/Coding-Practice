package baekjoon.greedy;

import java.lang.reflect.*;
import java.util.*;

// https://www.acmicpc.net/problem/1931
public class MeetingRoom1931 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] arr = new int[N][2];
		
		for(int i = 0; i<N; ++i) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] start, int[] end) {
				if(start[1] == end[1])
					return Integer.compare(start[0], end[0]);
				
				return Integer.compare(start[1], end[1]);
			}
			
		});
		
		int cnt = 0;
		int end = -1;
		for(int i=0; i<N; ++i) {
			if(arr[i][0] >= end) {
				end = arr[i][1];
				++cnt;
			}
		}
		
		System.out.println(cnt);
	}
}
