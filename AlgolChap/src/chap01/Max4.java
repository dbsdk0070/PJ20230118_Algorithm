package chap01;

import java.util.Scanner;

public class Max4 {
	// a, b, c, d의 최댓값을 구하여 반환
	static int max4(int a, int b, int c, int d) {
		int max = a; // 최댓값
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;

		return max;
	}

	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;

		return max;
	}

	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;

		return min;
	}

	static int med3(int a, int b, int c) {
		/*
		 * if (a >= b) if (b >= c) return b; else if (a <= c) return a; else return c;
		 * else if (a > c) return a; else if (b > c) return c; else return b;
		 */
		
		if((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if((b > a && b < c) || (a > b && c < b))
			return b;
		else 
			return c;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a, b, c;
		//int a, b, c, d;
		  
		/*
		 * System.out.println("네 정수의 최댓값을 구합니다."); System.out.print("a의 값 : "); a =
		 * stdIn.nextInt(); System.out.print("b의 값 : "); b = stdIn.nextInt();
		 * System.out.print("c의 값 : "); c = stdIn.nextInt();
		 * System.out.print("d의 값 : "); d = stdIn.nextInt();
		 * 
		 * int max = max4(a, b, c, d); // a, b, c, d의 최댓값
		 * 
		 * System.out.println("최댓값은 " + max + "입니다.");
		 * 
		 * System.out.println("Q1.최대값 -----------------------------");
		 * System.out.println("max3(1,2,3) = " + max3(1, 2, 3));
		 * System.out.println("max3(2,3,1) = " + max3(2, 3, 1));
		 * System.out.println("max3(1,3,2) = " + max3(1, 3, 2));
		 * 
		 * System.out.println();
		 * System.out.println("Q2.최소값 -----------------------------");
		 * System.out.println("min3(1,6,3)   = " + min3(1, 6, 3)); // 1
		 * System.out.println("min3(7,8,4)   = " + min3(7, 8, 4)); // 4
		 * System.out.println("min3(62,6,17) = " + min3(62, 6, 17)); // 6
		 */
		System.out.println();
		System.out.println("Q3.3개의 정수 입력받아 중앙 값 구하기--------");
		System.out.print("a의 값 : ");
		a = stdIn.nextInt();
		System.out.print("b의 값 : ");
		b = stdIn.nextInt();
		System.out.print("c의 값 : ");
		c = stdIn.nextInt();

		int med = med3(a, b, c);
		System.out.println("med 중간 값은 : " + med);
	}
}
