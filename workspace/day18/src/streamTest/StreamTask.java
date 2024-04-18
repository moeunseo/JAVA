package streamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
		// 1~10까지 arrayList에 담고 해당 리스트를 출력
		List<Integer> list = new ArrayList<>();
		//IntStream.rangeClosed(1, 10).forEach(list::add);
		IntStream.rangeClosed(1, 10).forEach(n->list.add(n));
		System.out.println(list);
		
		// ABCDEF를 출력 > IntStram으로 코딩해보기 어떠한 변수도 만들지 말기
		IntStream.rangeClosed(65, 70).forEach(n->System.out.print((char)(n)));
		System.out.println();
		
		
		// A~F까지 D 제외하고 ArrayList에 담고 출력
		//filter
		IntStream.rangeClosed(65,70).filter(n->n!=68).forEach(n->System.out.print((char)(n)));
		System.out.println();
		
		//map
		IntStream.rangeClosed(65,69).map(n->n>67?n+1:n).forEach(n->System.out.print((char)(n)));
		System.out.println();
		
		// 한글을 정수로 변경
		// 문자열.indexOf()
		// 문자열.charAt()
		String num1 = "공일이삼사오육칠팔구";
		String data1 = "공팔이구";
		//System.out.println(num1.indexOf(data1.charAt(3)));
		data1.chars().map(n -> num1.indexOf(data1.charAt(data1.indexOf(n)))).forEach(System.out::print);
		System.out.println();
		
		//정수를 한글로 변경
		String num2 = "공일이삼사오육칠팔구";
		String data2 = "0829";
		
		data2.chars().map(n -> num2.charAt(data2.charAt(data2.indexOf(n))-48)).forEach(n->System.out.print((char)n));
	}
}
