package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		
		// 제네릭까지 하나의 타입이다.
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// 비어있는 리스트
		System.out.println(numbers);
		
		// 추가
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		numbers.add(70);
		numbers.add(80);
		numbers.add(90);
		numbers.add(100);
		System.out.println(numbers);
		
		// 삽입
		// add 메소드의 오버로딩
		numbers.add(3, 35);
		System.out.println(numbers);
		
		// 인덱싱
		System.out.println(numbers.get(3));
		
		// 반복문
		// 리스트의 길이를 구하고 싶어요!
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}
		System.out.println();
		
		for (Integer integer : numbers) {
			System.out.print(integer+" ");
		}
		System.out.println();
		
		// 수정
		// 100을 95로 수정
		System.out.println(numbers.set(10, 95)+ "가 수정되었습니다.");
		System.out.println(numbers);
		
		// 삭제
		// 인덱스 번호로 삭제하기
		numbers.remove(3);
		System.out.println(numbers);
		numbers.remove((Integer)95);
		System.out.println(numbers);
		
		// 정렬
//		Collections안에 있는 메소드
		Collections.shuffle(numbers);
		System.out.println(numbers);
		
		Collections.sort(numbers);
		System.out.println(numbers);
		
		Collections.reverse(numbers);
		System.out.println(numbers);
	}
}
