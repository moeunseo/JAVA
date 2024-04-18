package input;

import java.util.Scanner;

public class ScannerTask {
	public static void main(String[] args) {
		//자동 import 단축키 > crtl + shift + o
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("두 정수를 입력하시오.");
		
//		String num1 = sc.next();
//		String num2 = sc.next();
//		int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
		
//		System.out.println("두 정수의 덧셈 결과는 "+sum+ " 입니다.");
		
//      Scanner sc = new Scanner(System.in);
//      String num1 = null, num2 = null;
//      
//      System.out.print("첫번째 정수 : ");
//      num1 = sc.next();
//      
//      System.out.print("두번째 정수 : ");
//      num2 = sc.next();
//      
//      System.out.print("두 정수의 합 : ");
//      System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		
		System.out.print("첫 번째 정수: ");
		num1 = Integer.parseInt(sc.next());
		
		System.out.print("두 번째 정수: ");
		num2 = Integer.parseInt(sc.next());
		
		System.out.printf("%d + %d = %d", num1, num2, num1+num2);
	}
}
