package control_for;

public class ForTest {
	public static void main(String[] args) {
		//본인의 이름을 10번 출력하는 반복문
		for(int i =0;i<10;i++) {
			String temp = String.format("%2d", i+1);
			System.out.println(temp + "번째 모은서");
		}
		
		//지역변수
		//System.out.println(temp);
		
		//1부터 10까지의 합
		int sum = 0; 
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
