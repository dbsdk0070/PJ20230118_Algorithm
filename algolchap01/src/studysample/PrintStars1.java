package example;

import java.util.Scanner;

class PrintStars1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, w;
		
		System.out.println("*을 n개 출력하되 w개마다 줄을 바꿔서 출력한다.");
		
		//n개를 출력할 수 있는 정수를 입력받음
		do {
			System.out.print("정수 n을 입력하세요 : ");
			n = sc.nextInt();
		}while(n <= 0);
		
		//w개마다 줄을 바꿔 출력될 수 있도록 w개의 수를 입력받음
		do {
			System.out.print("정수 w를 입력하세요 : ");
			w = sc.nextInt();
		}while(w <= 0 || w > n);
		
		//n개가 w개가될 때, 줄바꿈을 해줌 for문 사용 후 if문으로 조건 설정
//		for(int i=0; i<n; i++) {
//			System.out.print("*");
//			if(i % w == w-1) {
//				System.out.println();
//			}
//			if(i % w != 0) {
//				System.out.println();
//			}
		
		for(int i=0; i < n/w; i++)
			System.out.println("*".repeat(w));
			
			int rest = n%w;
			if(rest != 0) 
				System.out.println("*".repeat(rest));
	}
}
