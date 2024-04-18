package array;

import java.util.Scanner;

public class ArrayHomework {
	public static void main(String[] args) {
		// 5개의 정수를 입력받고 배열에 담은 후 최댓값과 최솟값을 출력
		
		//1) if문을 써서 값 비교하기
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print(i+1+ "번 째 정수를 입력하시오. ");
			numbers[i] = sc.nextInt();
		}
		//입력한 배열 값 출력
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+ " ");
		}
		
		//배열의 최댓값 최솟값 구하기
		max = numbers[0];
		min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
			
			if(min > numbers[i]) {
				min = numbers[i];
			}
		}
		System.out.print("\n배열 안에 최댓값: " + max + " 배열 안에 최솟값: " + min);
		
		
		//2) 자바 내장함수 사용하여 최댓값 최솟값 구하기
		max = numbers[0];
		min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			max = Math.max(max, numbers[i]);
			min = Math.min(min, numbers[i]);
		}
		System.out.print("\n배열 안에 최댓값: " + max + " 배열 안에 최솟값: " + min);
		
	}
}
