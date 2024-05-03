package testProject240503;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {
		// 파이썬의 input문 기능
		Scanner scanner;  //Scanner 클래스로 객체 선언
		scanner = new Scanner(System.in);  //객체 초기화는 new 연산자를 붙여야 함 
		
		System.out.print("당신의 이름을 입력하세요:");
		String inputData = scanner.nextLine();  // 엔터키 치기전까지 입력된 문자열 읽어오기
		System.out.println(inputData);
		
		
		
	}

}
