package apiTest;

import java.util.Scanner;

public class ApiTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Food food = null;
		System.out.print("음식명을 입력하시오 >>");
		String name = sc.next();
		System.out.print("가격을 입력하시오 >>");
		int price = sc.nextInt();
		System.out.print("주문 수량을 입력하시오 >>");
		int quantity = sc.nextInt();
		
		food = new Food(name, price, quantity);
		food.printTotalPrice(2500);
	}
}
