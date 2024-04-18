package print;

public class PrintfTest {
	public static void main(String[] args) {
		int num1 = 1;
		double data1 = 3.141592;
		
		System.out.printf("오늘은 %02d월 입니다. \n", num1);
		System.out.printf("파이의 값을 %10.2f이다.\n", data1);
		System.out.printf("문자는: %c\n", 'A');
		System.out.printf("문자열은: %s", "이창섭");
		
	}
}
