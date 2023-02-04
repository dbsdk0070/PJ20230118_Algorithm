package chap01;

import java.util.Scanner;

public class SumFor2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		//정수만 입력받도록 설정. 음수 또는 0이면 정수일때까지 반복
		do {
			System.out.print("n의 값 : ");
			n = sc.nextInt();
		}while(n <= 0);
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 : " + sum + " 입니다.");
	}
}
