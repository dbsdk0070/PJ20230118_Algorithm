package example;

import java.util.Scanner;

class Square {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n; //정사각형 만들 입력 숫자
	
		do {
			System.out.print("숫자를 입력하세요 : "); n = sc.nextInt();
		}while(n <= 1);
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++)
			System.out.print("*");
			System.out.println();
		}
	}
}
