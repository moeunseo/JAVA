package control;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("반복할 횟수를 입력하시오.");
//		int num = sc.nextInt();
//		int sum = 0;
//		for(int i=1;i<=num;i++) {
//			sum+=i;
//		}
//		System.out.println("총합 : "+ sum);
//		
//		for(int i=65;i<=70;i++) {
//			char c = (char)i;
//			System.out.println(c);
//		}
		
		for(int i=0;i<5;i++) {
			System.out.print(i>1 ? (char)(i+66) + " ": (char)(i+65)+ " ");
		}
	}
}
