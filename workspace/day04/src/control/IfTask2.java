package control;

import java.util.Scanner;

public class IfTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String msg = null;
		
		if(num1 > num2) {
			msg = "큰 수: " + num1;
		}
		else if(num1 == num2) {
			msg = "두 수는 같습니다.";
		}
		else {
			msg = "큰 수:" + num2;
		}
		System.out.println(msg);
		
	}
}
