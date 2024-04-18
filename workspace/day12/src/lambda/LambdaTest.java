package lambda;

public class LambdaTest {
	public static void main(String[] args) {
		
		// 람다식은 항상 리턴이 있어야 한다.
		// 한 줄에 끝낼 수 있을 때 사용!
		InterA inter = (number) -> number % 2== 0;
		
		System.out.println(inter.checkEven(10));
		
		// 여러 줄을 작성할 시 중괄호 열기
		InterA inter2 = (n) ->{
			System.out.println("짝수일까요?");
			return n % 2 == 0;
		};
		
		System.out.println(inter2.checkEven(9));
		
		// 1~200까지 숫자 중, 7의 배수가 몇 개인지 구하시오.
		
	}
}
