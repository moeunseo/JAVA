package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
		// 5개의 정수를 입력받아 배열을 만드는 프로그램
		// 무한반복 구현
		// q를 입력하면 나가기
		// if문은 딱 한번만 사용(q 입력 시 탈출하는 용도)
		// 단, 입력 받을 때는 무조건 next()만 사용하기
		// 문자열 비교는 equals
		// 
		
		Scanner sc = new Scanner(System.in);
		int[] datas = new int[5];
		int i = 0;
		String num = null;
		
		while(true) {
			System.out.print(++i + "번째 숫자를 입력하시오 >> ");
			num = sc.next();
			
			if(num.equals("q")) {
				System.out.println("입력종료");
				break;
			}
			
			try {
				datas[i-1] = Integer.parseInt(num);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 크기는 5개!");
				break;
			} catch(NumberFormatException e) {
				System.out.println("정수 or q만 입력해");
				i--;
			} catch(Exception e) {
				System.out.println("예기치 못한 에러 발생");
				System.out.println(e);
				break;
			}
			if(i==5) {
				System.out.println("입력을 끝마칩니다.");
				break;
			}
		}
		for (int j = 0; j < datas.length; j++) {
			System.out.print(datas[j]+ " ");
		}
	}
}
