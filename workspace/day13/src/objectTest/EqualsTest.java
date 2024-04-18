package objectTest;

public class EqualsTest {
	public static void main(String[] args) {
//		String[] data1 = {"ABC", "DEF", "GHI"};
//		String[] data2 = {"ABC", "DEF", "G"};
//		
//		String data3 = new String("DEF");
//		String data4 = new String("DEF");
//		
//		// == : 주소 값 비교
//		for (int i = 0; i < data2.length; i++) {
//			if(data1[i].equals(data2[i])) { // ==으로도 가능
//				System.out.println("두 배열의 값은 같아!");
//			}
//		}
//		System.out.println(data3==data4);
//		System.out.println(data3.equals(data4));
		
		Animal ani1 = new Animal(1, "주작이", 9, "고양이", "3.9kg");
		Animal ani2 = new Animal(1, "꽁치", 2, "고양이", "4.6kg");
		
		System.out.println(ani1==ani2);
		System.out.println(ani1.equals(ani2));
	}
}
