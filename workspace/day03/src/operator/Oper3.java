package operator;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//		두 정수를 입력받아서 두 수의 차이를 구하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수의 정수를 입력하시오.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String result = null;
		
//		result = num1>num2 ? num1-num2 : num2-num1;
//		System.out.println(result);
		
		result = num1 > num2 ? "큰 수: "+ num1 : num1==num2 ? "두 수는 같습니다." : "큰 수: " + num2;
		System.out.println(result);
	}
}
