package operator;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		사용자에게 키를 입력받고
//		정수라면 정수로 출력, 실수라면 실수로 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키 입력: ");
		String result = null;
		boolean ck = false;
		double num = sc.nextDouble();
		
		ck = num-(int)num == 0;
		result = ck ? (int)num + "cm": num + "cm";
		System.out.println(result);
	}
}
