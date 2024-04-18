package array;

import java.util.Iterator;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] datas = {1,3,5,7,9};
		
		System.out.println(datas); //시작주소
		System.out.println(datas[3]); //주소 안에 있는 값 가져오기
		
		//datas 안에 저장되어있는 정수의 총합과 평균 출력
		int sum =0;
		for(int i=0;i<datas.length;i++) {
			sum +=datas[i];
		}
		System.out.println("총합: "+ sum);
		System.out.println("평균: "+ sum/datas.length);
		
		System.out.println("=======================================================");
		
//		배열 선언 후에 5-1까지 데이터 넣고 출력
		int[] numbers = new int[5];
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = 5-i;
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
	}
}
