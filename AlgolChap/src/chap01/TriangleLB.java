package chap01;

import java.util.Scanner;

class TriangleLB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("단을 입력하세요 : ");
			n = sc.nextInt();
		}while(n <= 0);
	
		
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println(); 
	}
		 
	
		
		
		/*
		 * for (int i = 1; i <= n; i++) { for (int j = 1; j <= i; j++)
		 * System.out.print('*'); System.out.println(); }
		 */
	}
}
