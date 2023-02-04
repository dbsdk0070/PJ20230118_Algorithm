package chap01;

import java.util.Scanner;

class SumVerbose1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		//1부터 n까지의 합 구하기(if문을 사용해서 출력과정 확인)
		System.out.println("임의의 정수를 입력받아 1~n까지 숫자의 합 구하기");
		
		//1.정수만 입력받을 수 있다.
		do {
			System.out.print("숫자를 입력하세요 : ");
			n = sc.nextInt();
			}while(n <= 0);
		
		int sum = 0; 	//합
		
		for(int i=1; i<n; i++) {
			/*
			 * if(i<n) { //중간과정 System.out.println(i + "+"); }else { //마지막과정
			 * System.out.println(i + "="); }
			 */
			sum += i;
		}
		
		//for문 사용시 반복횟수를 n-1번으로 하고, if문의 판단횟수를 0번으로 줄였다.
		//마지막과정인 n값을 더해줌 ∴ i <= n 하는것보다 추가수행이 줄어듦
		//sum += n;
		//System.out.println("1 ~ " + n + "까지의 합 : " + sum);
		
		//또는 단순 대입 연산자(=) 또는 복합 대입 연산자(+= /=)를 사용하면 대입한 뒤 왼쪽 피연산자의 형과 값을 얻을 수 있음
		System.out.println(n + "=" + (sum+=n));
	}
}
