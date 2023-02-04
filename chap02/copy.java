package chap02;

import java.util.Arrays;
import java.util.Scanner;

//배열 b의 모든 요소를 배열 a에 복사하는 메서드를 만들어라
public class copy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 요솟수 : ");
		int num1 = sc.nextInt();
		int a[] = new int[num1];

		for(int i=0; i<a.length; i++) {
			System.out.print("num1[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("b의 요솟수 : ");
		int num2 = sc.nextInt();
		int b[] = new int[num2];
		
		for(int i=0; i<b.length; i++) {
			System.out.print("num2[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		copyMethod(a, b);
		
		System.out.println("배열 b의 모든 요소를 배열 a에 copy하였습니다.");
		
		for(int i=0; i<num1; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
		}
	
	}//main End
	
	//배열 b의 모든 요소를 배열 a에 copy
	static void copyMethod(int[] a, int[] b) {
		
		//배열 b의 역순화 메서드 호출
		for(int i=0; i<b.length/2; i++) {
			reverse(b, i, b.length -i -1);
		}
		
		//a, b 두 개의 배열을 가져와서 a의 길이가 b보다 작으면 a, 아니면 b
		int num = a.length <= b.length ? a.length : b.length;
		
		for(int i=0; i<num; i++) {
			a[i] = b[i];
		}
	}
	
	//배열 b의 역순화
	static void reverse(int[] b, int idx1, int idx2){
		int t = b[idx1];
		b[idx1] = b[idx2];
		b[idx2] = t;
	}
}//sumOf End


