package collection;

import java.util.Scanner;

public class CoffeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CoffeeService cf = new CoffeeService();
		String startMenu = "1. 메뉴 추가 2. 메뉴 삭제 3. 메뉴 판매 4. 메뉴 검색 0. 종료";
		int choice = 0;
		int price = 0;
		String name = null;
		String coffee_menu = null;
		boolean menu_ck = false;
		
		Coffee c1 = new Coffee("아메리카노", "커피", 3500, false);
		cf.addMenu(c1);
		
		while(true) {
			System.out.println(startMenu);
			System.out.print("선택 >>");
			choice = sc.nextInt();
			
			if(choice == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
			switch(choice) {
			case 1:
				System.out.print("메뉴를 추가해봐>> ");
				break;
				
			case 2:
				System.out.print("삭제할 메뉴 이름을 적어줘 >>");
				name = sc.next();
				menu_ck = cf.removeMenu(name);
				
				if(menu_ck) {
					System.out.println(name + "이(가) 삭제되었습니다.");
				}
				else {
					System.out.println("그런 메뉴는 없습니다.");
				}
				break;
			case 3:
				System.out.print("판매할 메뉴 이름을 적어줘 >>");
				name = sc.next();
				price = cf.sellMenu(name);
				System.out.println(name+"이 "+ price +"가격으로 판매되었습니다.");
				break;
			case 4:
				System.out.println("검색할 커피 종류를 적어줘 >> ");
				coffee_menu = sc.next();
				System.out.print(cf.searchKind(coffee_menu)); 
				break;
			default:
				System.out.println("번호를 다시 입력해줘");
			}
		}
		

		
	}
	
}
