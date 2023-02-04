package chap01;

import java.util.Scanner;

class Triangle {
	//왼쪽 위, 오른쪽 위, 오른쪽 아래가 직각인 이등변삼각형을 출력하는 메서드 작성
	
	//왼쪽아래
	static void triangleLB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	//왼쪽 위
	static void triangleLU(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) // ex) n이 5일 때 : 5-2+1 = 4
			System.out.print("*");
			System.out.println();
		}
	}
	
	//오른쪽 위
	static void triangleRU(int n) {
			for(int i=1; i<=n; i++) {		//i행(i=1,2,...n)
				for (int j = 1; j <= i - 1; j++)	//i-1개의 ''을 출력
					System.out.print(' ');
				for(int j=1; j<=n-i+1; j++)	//n-i+1개의 '*'를 출력
					System.out.print("*");
				System.out.println();		//줄바꿈
			}
			
	}		
	
	//오른쪽 아래
	static void triangleRB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++)
				System.out.print(" ");
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	static void spira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++)
				System.out.print(" ");
			for(int j=1; j<=(i-1)*2+1; j++)
				//System.out.print("*");
				System.out.print(i%10);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("직각삼각형의 단을 입력하세요 : ");
			n = sc.nextInt();
		}while(n <= 0);
		
		//왼쪽 아래
		System.out.println("왼쪽 아래가 직각인 삼각형");
		triangleLB(n);
		
		//왼쪽 위
		System.out.println("왼쪽 위가 직각인 삼각형");
		triangleLU(n);
		
		//오른쪽 위
		System.out.println("오른쪽 위가 직각인 삼각형");
		triangleRU(n);
		
		//오른쪽 아래
		System.out.println("오른쪽 아래가 직각인 삼각형");
		triangleRB(n);
		
		//n단의 피라미드 출력
		System.out.println(n + "단의 피라미드 출력");
		spira(n);
	}
}


