package testProject240503;

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 20;
		int result1 = ++x;
		int result2 = y++;
		
		System.out.println(result1);		
		System.out.println(x);
		System.out.println(result2);		
		System.out.println(y);
		
		int a = 1;
		int b = 1;
		int result3 = ++a +10;
		System.out.println(result3);		
		System.out.println(a);

		int result4 = b++ +10;
		System.out.println(result4);		
		System.out.println(b);
		
		int sum = 0;
		int i = 10;
		
		sum = sum + i;
		sum += i;
		
		sum *= i;
		
		int score = 95;
		char grade = (score > 90) ? 'A':'B';
		System.out.println(grade);
		
		int x1 = 10;
		int y1 = 5;
		System.out.println((x1>7) && (y1<=5));
		System.out.println((x1 % 3 ==2) || (y1 % 2 != 1));
		
			
		

	}

}
