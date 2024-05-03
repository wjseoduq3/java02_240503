package testProject240503;

public class MainClass5 {

	public static void main(String[] args) {
		
		int score = 85;
		
		if (score >= 90) {
			System.out.println("수!");
		} else if (score >= 80) {
			System.out.println("우!");
		} else if (score >= 70) {
			System.out.println("미!");
		} else if (score >= 60) {
			System.out.println("양!");
		} else {
			System.out.println("가!");
		}
			
	
	
	
		// Switch 문
		int favor = 1;
	
		switch (favor) {
			case 1: 
				System.out.println("안녕!");
				break;
			case 2: 
				System.out.println("감사!");
				break;
			case 3: 
				System.out.println("Hi!");
				break;
			default:
			System.out.println("잘가요");
		}
	}
}
	
