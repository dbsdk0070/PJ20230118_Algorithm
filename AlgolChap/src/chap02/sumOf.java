package chap02;

import java.util.Scanner;

public class sumOf {
	public static void main(String[] args) {
		//배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.
		Scanner sc = new Scanner(System.in);
		
		int num;
		//입력한계 요소수
		do {
			System.out.print("요소수를 입력하세요 : ");
			num = sc.nextInt();
		}while(num <= 0 || num > 5);
	
		//요소수 입력받아 배열로 만들기
		int numArr[] = new int[num];
		for(int i=0; i<numArr.length; i++) {
			System.out.print("numArr[" + i + "] : ");
			numArr[i] = sc.nextInt();
		}
		
		//배열의 요소수 합계 구하는 메서드 호출(umArr배열 하나만 보내도 배열內 요소 파라미터로 넘어감)
		System.out.println(sumOfMethod(numArr));
		
		
	}//main End

	static int sumOfMethod(int[] a){
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
}//sumOf End







