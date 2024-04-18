package anoymousTask;

import java.util.Iterator;

public class Building { 
	public static void main(String[] args) {
		
		// 강남점
		// 본사에서 정해준 양식대로 보고한 후 오픈하자.
		Hollys gamnam = new Hollys();
		Form gnForm = new Form() {
			
			@Override
			public void sell(String order) {
				String[] menus = getMenu();
				for (int i = 0; i < menus.length; i++) {
					if(order.equals(menus[i])) {
						System.out.println("판매완료");
						return;
					}
				}
				System.out.println("메뉴가 없습니다.");
			}
			
			@Override
			public String[] getMenu() {
				String[] menus = {"아메리카노", "카페라떼", "돌체라떼"};
				return menus;
			}
		};
		gamnam.register(gnForm);
		
		// 신림점
		// 신림점에서는 무료 나눔 행사 진행할 예정
		// 본사에 제출할 양식에서 판매 방식은 구현할 필요가 없습니다.
		// 본사에서는 전달 받는 양식은 검사할 때 무료나눔 행사 중인 매장이라면,
		// "무료 나눔 행사 중" 출력하고 검사 끝
		Hollys silim = new Hollys();
		SellAdapter silForm = new SellAdapter() {
			@Override
			public String[] getMenu() {
				String[] menus = {"아메리카노", "모카라떼", "딸기라떼"};
				return menus;
			}
		};
		silim.register(silForm);
	}
}
