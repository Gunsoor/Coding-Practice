package baekjoon;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1712
public class BreakEvenPoint1712 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		long c = scan.nextInt();
			
		int make = 1;
        
		if(b >= c) {
			System.out.println(-1);
		} else {
            while(c*make<=a+(b*make)) {
			    ++make;
		    }
		    System.out.println(make);
        }
        
		
		
	}
}
