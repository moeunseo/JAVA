package array;

public class ArrayTask2 {
	public static void main(String[] args) {
		int[] numbers = new int[100];
		int sum = 0; //짝수의 합을 넣을 변수
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = i+1;
			if(numbers[i]%2==0) sum+=numbers[i];
		}
		System.out.println("총합: " + sum);
		
		char[] c = new char[5];
		for(int i=0;i<c.length;i++) {
			c[i] = (char)(i+65);
			if(i>1) c[i] = (char)(i+66);
		
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
