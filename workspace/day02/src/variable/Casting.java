package variable;

public class Casting {
	public static void main(String[] args) {
		//자동 형변환
//		정수와 정수의 연산 결과는 정수
//		정수와 실수의 연산 결과는 실수
		System.out.println(10/3);
		System.out.println(10%3);
		System.out.println(10/(3+0.0));
		
		//대입 연산을 이용한 자동 형변환
		//메모리를 할당하면 이에 대한 용량만큼 채워서 사용해야한다.
		double data = 49;
		System.out.println(data);
		
		//강제 형변환
		System.out.println("\n----강제 형변환----");
		System.out.println(10/(double)3);
		System.out.println((int)8.63+2.59);
		
		//출력의 결과가 10이 나오도록 수정
		//강제 형변환 이용
		System.out.println((int)8.63+(int)2.59);
		
		//출력의 결과가 11이 나오도록 수정
		//강제 형변환 이용
		System.out.println((int)(8.63+2.59));
	}
}
