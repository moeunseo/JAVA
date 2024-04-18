package array;

import java.util.Scanner;

public class ArrayTask3 {
	public static void main(String[] args) {
		//사용자에게 배열의 크기를 입력받고 
		//크기에 맞게 들어갈 값을 입력받아 배열 만들기
		int[] datas = null;
		int number = 0; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기를 적어주세요.");
		
		datas = new int[sc.nextInt()];
		
		for (int i = 0; i < datas.length; i++) {
			System.out.print(i+1 + " 번째 정수 입력 >>");
			datas[i] = sc.nextInt();
		}
		for (int i = 0; i < datas.length; i++) {
			System.out.print(datas[i] + " ");
		}
		
	}
}
