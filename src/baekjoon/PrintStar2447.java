package baekjoon;

import java.util.*;

public class PrintStar2447 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] arr;
		int N = scan.nextInt();
		arr = new char[N][N];
		printStar(0, 0, N, false, arr);
		
		// println으로 다찍으면 속도가느려 백준알고리즘에서 제한시간이 부족함.
		// 그래서 builder로 만든 후 한번 print
		
		StringBuilder builder = new StringBuilder();
		
		for (char[] arrX : arr) {
			for (char arrY : arrX) {
				builder.append(arrY);
			}
			builder.append('\n');
		}
		
		System.out.println(builder);
	}

	public static char[][] printStar(int x, int y, int N, boolean blank, char[][] arr) {
		// 3*3배열의 한 칸당 사이즈를 정함
		int size = N / 3;
		// 3*3를 찍으며 5번째오는 배열은 공백을 채워야함
		int count = 0;
		// size가 1일때, 3*3배열을 채워나감 
		if (size == 1) {
			for (int i=x ; i<x+N ; i++) {
				for (int j=y ; j<y+N ; j++) {
					if (count == 4)
						arr[i][j] = ' ';
					else
						arr[i][j] = '*';
					count++;
				}
			}
		}
		
		
		// 만약 size가 1이 넘어가면 3*3 배열 중 공백을 채울 위치를 찾아 파라미터(blank)로 넘겨줌
		if (size > 1) {
			for (int i=x ; i<x+N ; i+=size) {
				for (int j=y ; j<y+N ; j+=size) {
					if (count == 4)
						printStar(i, j, size, true, arr);
					else
						printStar(i, j, size, false, arr);
					count++;
				}
			}
		}

		// 앞의 과정들을 모두 수행 한 후 blank가 참이라면 공백으로 덮어써줌
		if (blank) {
			for (int i=x ; i<x+N ; i++) {
				for (int j=y ; j<y+N ; j++) {
					arr[i][j] = ' ';
				}
			}
		}
		
		return arr;

	}
}
