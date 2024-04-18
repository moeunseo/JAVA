package array;

import java.util.Scanner;

public class ArrayHomework2 {
	public static void main(String[] args) {
		//사용자가 입력한 정수의 개수만큼 배열을 만든 후
		//개수만큼 정수를 입력받아 요소를 채운 후, 요소들의 평균 구하기
		//평균은 소수점 둘째자리까지 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하시오.");
		int[] arr = new int[sc.nextInt()];
		double avg = 0.0; //배열 원소들의 평균
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + " 번째 원소: ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			avg +=arr[i];
		}
		System.out.printf("평균: %.2f", avg/arr.length);
		
	}
}
