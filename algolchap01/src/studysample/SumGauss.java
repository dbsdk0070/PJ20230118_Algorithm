package example;

import java.util.Scanner;

public class SumGauss {
	//정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드 작성
	static int addReturn(int a, int b) {
		int min; 	//a,b의 작은 쪽의 값
		int max;	//a,b의 큰 쪽의 값
		
		if(a < b) {
			min = a; max = b;
		}else {
			min = b; max = a;
		}
		
		int sum = 0;	//총합
		for(int i = min; i<=max; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//'가우스의 덧셈 : 1~10의 합은 (1+10)*5'을 이용하여 1부터 n까지의 합을 구하라.
		System.out.println("1에서 n까지의 총합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = (1+n)*(n/2) + (n%2 == 0 ? 0 : (n+1)/2);
		System.out.println("1에서 " + n + "까지의 총합은 " + sum + "입니다.");
		
		System.out.println("------------------------");
		System.out.println("두 개의 정수를 입력하세요.");
		System.out.print("a : "); int a = sc.nextInt();
		System.out.print("b : "); int b = sc.nextInt();
		
		System.out.println("정수 a, b의 총 합은 : " + addReturn(a, b) + " 입니다.");
	};
}
