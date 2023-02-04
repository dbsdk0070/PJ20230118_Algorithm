package chap01;

import java.util.Scanner;

class Multi99Table {
	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); int n;
		 * 
		 * do { System.out.print("단을 입력하세요 : "); n = sc.nextInt(); }while(n <= 0);
		 */
		
		/*
		 * for(int i=2; i<=n; i++) { for(int j=1; j<=9; j++) { System.out.println(i +
		 * "*" + j + "=" + i * j); } }
		 */
		System.out.print("   |");
		for(int i=1; i<=9; i++) 
			System.out.printf("%3d", i);
			System.out.println("\n---+---------------------------");
			
			for(int i=1; i<=9; i++) {
				System.out.printf("%2d |", i );
				for(int j=1; j<=9; j++)
			System.out.printf("%3d", i + j);
			System.out.println();
		}
	}
}