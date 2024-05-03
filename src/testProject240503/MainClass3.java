package testProject240503;

public class MainClass3 {

	public static void main(String[] args) {
		
		int num = 100;
		if (num == 100) {
			System.out.println("축하합니다. 100점입니다.");
		}
		
		// 문자열(객체) 비교할 때가 까다로움
		String str1 = "Korea";
		String str2 = "Korea";
		// if (str1 == str2) { 이것 안쓰고 아래 형식 이용
		if (str1.equals(str2)) {
			System.out.println("당신은 한국인 입니다.");
		}
	
	}

}
