package chap02;

import java.util.Random;
import java.util.Scanner;

public class IntArray {
	public static void main(String[] args) {
		int[] a = new int[5];
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;
		
		for(int i=0; i<a.length; i++)
		System.out.println("a[" + i + "] = " + a[i]);
		
		System.out.println("--------------------------------");
		//int[] b = new int[5]; 변수를 생성하고 값을 대입하는것이 아닌,
		//배열 본체{1,2,3,4,5} 생성과 동시에 값 할당.
		//배열 b는 int형 배열
		
		int[] b = {1,2,3,4,5};
		for(int i=0; i<b.length; i++)
			System.out.println("b[" + i + "] = " + b[i] );
		System.out.println("--------------------------------");
		
		int[] c = {1,2,3};
		int max = c[0];
		for(int i=0; i<c.length; i++)
			if(c[i] > max) max = c[i];
		System.out.println(max);
		System.out.println("--------------------------------");

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		/*
		 * System.out.print("사람 수를 입력받음 : "); int num = sc.nextInt();
		 * 
		 * int[] height = new int[num]; for(int i=0; i<num; i++) {
		 * System.out.print("height[" + i + "] : "); height[i] = sc.nextInt(); }
		 * System.out.println("height의 최대 값은 : " + maxOf(height) + " cm입니다."); //height
		 * 배열 본체를 참조
		 */
		System.out.println("--------------------------------");
		System.out.print("사람 수 입력받음 : "); int num2 = sc.nextInt();
		
		int[] height2 = new int[num2];
		for(int i=0; i<num2; i++) {
			height2[i] = 100 + rand.nextInt(90);
			System.out.println("height2[" + i + "] :" + height2[i]);
		}
		System.out.println("height2의 최대 값은 : " + maxOf(height2) + "cm 입니다.");
	}//main end
	
	
	static int maxOf(int[] a) {
		int max = a[0];
		
		for(int i=1; i<a.length; i++)
			if(a[i] > max) max = a[i];
			return max;
	}
}






