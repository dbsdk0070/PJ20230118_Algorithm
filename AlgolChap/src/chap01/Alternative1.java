package chap01;

import java.util.Scanner;

class Alternative1 {
	public static void main(String[] args) {
		//+와 -를 번갈아 n개 출력하기
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("+와 -를 번갈아 출력합니다.");
		
		do {
			System.out.println("n의 값을 입력하세요.");
			System.out.print("n : "); n = sc.nextInt();
		}while(n <= 0);

//		for(int i=0; i<n; i++) {
//			if(i%2==0) {
//				System.out.print("+");
//			}else {
//				System.out.print("-");
//			}
		
		for(int i=0; i<n/2; i++) {		//n이 12이라고 한다면 /2로, 6번만 출력하면 됨
			System.out.print("+-");
		}
		if(n%2 != 0) {					//n이 홀수일때만 +를 출력한다. why? 0부터 시작했으니 1부터 /2 할텐데, 1은 홀수인데 +로 시작하기 때문.
			System.out.println("+");
		}
		
		//ex) 예를들어, for문의 i=0을 i=1로 바꾸는것으로만 해도, if문의 사용은 필요 없어짐.
		//for문의 초기화 부분만 변경하고 루프 본문은 그대로 둔다.
		
	}
}
