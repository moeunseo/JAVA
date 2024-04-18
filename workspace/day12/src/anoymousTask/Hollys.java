package anoymousTask;

public class Hollys { // 본사
	// 양식을 검사하는 메소드
	public void register(Form form) {
		String[] menus = form.getMenu();
		
		System.out.println("----- 메뉴 -----");
		
		for (int i = 0; i < menus.length; i++) {
			System.out.println(i+1 + ". "+ menus[i]);
		}
		
		if(form instanceof SellAdapter) {
			System.out.println("무료나눔 진행 중!");
		}
		else {
			form.sell("라임패션티");
		}
	}
}
