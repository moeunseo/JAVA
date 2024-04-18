package operator;

public class Oper5 {
	public static void main(String[] args) {
		//복합 대입연산자, 증감연산자
		int data = 10;
		
		System.out.println(data = 11);
		
		//후위형: 코드가 실행되는 시점에서 +1이 되지 않는다.
		System.out.println(data++);
		//실행된 이후에 정상적으로 +1
		System.out.println(data);
		
		//전위형: 코드가 실행되는 시점에서 +1이 되어있다.
		System.out.println(++data);
		System.out.println(data);
	}
}
