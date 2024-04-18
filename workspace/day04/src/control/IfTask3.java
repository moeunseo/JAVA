package control;

import java.util.Scanner;

public class IfTask3 {
	public static void main(String[] args) {
		// 사용자에게 국영수 점수를 입력 받아 총점과 평균을 구한다. 평균은 실수
		// 90점 이상 'A'
		// 80점 이상 90점 미만 : 'B'
		// 70점 이상 80점 미만 : 'C'
		// 60점 이상 70점 미만 : 'D'
		// 나머지는 F
		
		//출력은 "총점 : 270점"
		//평균은 : 90.00점
		//등급: A
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 영어 수학 점수를 입력하시오.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1+num2+num3;
		double result = sum / 3.0;
		char grade = ' ';
		String str = null;
		
		if(result >= 90) {
			grade = 'A';
		}
		else if(result>=80) {
			grade = 'B';
		}
		else if(result>=70) {
			grade = 'C';
		}
		else if(result>=60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		//System.out.printf("총점: %d\n평균: %.2f\n등급: %c", sum, result, grade);
		
		//printf를 사용하지 않고 서식지정을 하는 방법
		str = String.format("%.2f", result); //소수점 둘째짜리까지 가져옴
		System.out.println("총점: " + sum + "점");
		System.out.println("평균: " + str + "점");
		System.out.println("등급: " + grade + "등급");
	}
}
