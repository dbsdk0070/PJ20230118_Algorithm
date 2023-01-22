package example;

import java.util.Scanner;

public class SumWhile {
	//[1부터 n까지의 합 구하기]
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("n의 값을 입력하세요 : ");
		int n = sc.nextInt();
		
		int sum = 0; //합
		//int i = 1;
		
		//while문
		/*
		 * while(i <= n) { sum += i; i++; }
		 */
		
		//for문 : 하나의 변수를 사용하는 반복문은 while문보다 for문으로 사용하는것이 좋다.
		for(int i=0; i<=n; i++) {
			sum += i;
		}

		System.out.println(n + "의 합은 : " + sum + "입니다.");
	}
};


