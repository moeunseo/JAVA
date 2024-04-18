package array;

public class ArrayTest {
	public static void main(String[] args) {
		//1~100까지 배열에 담은 후 짝수만 출력
		int[] numbers = new int[100];
		
		//값을 넣어주는 반복문
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		//짝수만 출력
		//1. 반복 횟수를 50번만 돌리기
		for (int i = 0; i < 50; i++) {
			System.out.println(numbers[i*2+1]);
		}
		
		//2. 반복 횟수 100번
		for (int i = 0; i < numbers.length; i++) {
			if(i%2==0) { //인덱스번호가 짝수일 때(즉 홀수가 저장되었을 때)
				continue; //즉시 다음 반복 실행
			}
			System.out.println(numbers[i]);
		}
	}
}
