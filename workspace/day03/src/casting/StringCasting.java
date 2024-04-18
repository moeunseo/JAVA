package casting;

public class StringCasting {
	public static void main(String[] args) {
		String num = "123";
		System.out.println(num + 100);
		System.out.println(Integer.parseInt(num) + 100);
		
		int result = Integer.parseInt(num);
		System.out.println(result);
		
		System.out.println(Double.parseDouble("3.14") + 10);
		
		//자료형 초기값
		int data = 0;
		double weight = 0.0;
		char input = ' ';
		String name ="";

		//null은 모든 클래스의 초기값
		String hometown = null;
		
		System.out.println(name + "창섭");
		System.out.println(hometown + "신림");
	}
}
