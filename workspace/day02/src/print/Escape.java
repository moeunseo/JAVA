package print;

public class Escape {
	public static void main(String[] args) {
		/*제어문자
		 * 쌍따음표 안에서 어떠한 기능을 하는 친구들
		 * 
		 *\n: new line, 줄 바꿈
		 *\t: tab 일정 간격 띄어쓰기 (동일한 간격)
		 *\": " 표현
		 *\': ' 표현
		 * 
		 * */
		System.out.println("새해 복\n많이 받으세요~");
		System.out.println("새해 복\t많이 받으세요~");
		System.out.println("이창섭 \"사랑해\"");
		System.out.println("\\ 는 제어문자를 만들 때 사용합니다.");
	}
}
