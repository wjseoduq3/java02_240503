package testProject240503;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!");
		System.out.print("Hello World!!");
		System.out.println("Hello World!!");
		
		int numInt;  // 정수변수 선언
		numInt = 10;  // 초기값 설정
		
		double numDouble;
		numDouble = 3.14;
		
		String str;
		str = "Korea";
		
		boolean logi;
		logi = true;
		
		char ch;
		ch = 'A';
		
		char ch1 = 65;
		System.out.println(ch1);
		
		// 임시 형 변환
		int dint = (int)numDouble;
		System.out.println(dint);
		
		double idou = (double)numInt;
		System.out.println(idou);
		
		// 문자열을 정수로, 정수/실수를 문자열로 변환
		// wrapper class 사용
		String strInt = "1000";
		
		// int strSample = (int)strInt;  // 임시 형변환 불가능
		int strSample = Integer.parseInt(strInt);
		System.out.println(strSample);
		
		String strDouble = "3.14";
		double strSample1 = Double.parseDouble(strDouble);
		System.out.println(strSample1);
		
		int numInt1 = 101;
		String numStr1 = String.valueOf(numInt1);
		System.out.println(numStr1); 
		
		System.out.printf("정수값 출력: %d", numInt1);
		
		
		
		
		
	}

}
