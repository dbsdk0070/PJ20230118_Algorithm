package chap02;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray02 {
	
	//reNum배열본체 a에 통째로 넘어옴
	//배열a를 역순으로 정렬
	static void Reverse(int[] a) {
		for(int i=0; i<a.length/2; i++)
			swap(a, i, a.length -i -1);
	}
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.print("요소수를 입력하세요 : ");
			num = sc.nextInt();
		}while(num <= 0 || num > 5);
		
		int[] reNum = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("reNum[" + i + "] : ");
			reNum[i] = sc.nextInt();
		}
		//reNum[i] 배열 reNum 매개변수로 본체 통째로 넘겨줌 
		Reverse(reNum);
		
		System.out.println("배열을 역순으로 정렬했습니다.");
		System.out.println("reNum : " + Arrays.toString(reNum));
	}
}






