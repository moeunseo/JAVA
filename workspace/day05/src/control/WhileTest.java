package control;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
//		while(true) { 무한반복문
//			System.out.println("내일은 우리 강의 없다!~");
//		}
		
		//while문을 for문처럼 사용해보자
//		int count = 0;
//		while(count !=10) {
//			count++;
//			System.out.println(count + ". 모은서");
//		}
	
		//사용자에게 입력받은 횟수만큼 출력
		int count = 0, num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력하시오");
		count = sc.nextInt();
		
		while(true) {
			num++;
			System.out.println(num + ". 모은서");
			if(num==count) break;
		}
	}
}
