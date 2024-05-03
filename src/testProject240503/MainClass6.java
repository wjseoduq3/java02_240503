package testProject240503;

import java.util.Iterator;

public class MainClass6 {

	public static void main(String[] args) {
		// for 문
		for (int i=1;i<=10;i++) {  // 초기값;조건식;증감식
			System.out.println(i);
		}
		
		for (int i=100;i>0;i--) {  // 초기값;조건식;증감식
			System.out.println(i);
		}
		
		for (int i = 0; i <= 1000; i += 2) {
			System.out.println(i);
		}
	
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
			System.out.println(sum);
			
		}
		
		
	}

}
