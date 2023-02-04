package chap01;

import java.util.Scanner;

class TwoDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		
		System.out.println("2자리 양수를 구합니다.");
		do {
			System.out.print("2자리 양수를 입력하세요 :");
			no = sc.nextInt();
		}while(no < 10 || no > 99);
		System.out.println("2자리의 양수는 : " + no + "입니다.");
	}
}
