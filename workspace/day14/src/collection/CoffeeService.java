package collection;

import java.util.ArrayList;
import java.util.List;

// Coffee 클래스를 이용한 프로젝트를 진행하는데 있어
// 필요한 기능들을 정의할 클래스!
public class CoffeeService {
	// 커피 메뉴를 넣을 리스트
	// coffe 메뉴를 저장할 db 선언
	public static List<Coffee> coffees = new ArrayList<>();
	
	// coffee 메뉴 추가
	public void addMenu(Coffee coffee) {
		coffees.add(coffee);
	}
	
	// coffee 메뉴 삭제
	// 메뉴의 이름으로 삭제
	public boolean removeMenu(String name) {
		// 일반 포문
//		for (int i = 0; i < coffees.size(); i++) {
//			if(coffees.get(i).getName().equals(name)) {
//				coffees.remove(i);
//				return true;
//			}
//		}
//		return false;
		
		for (Coffee coffee : coffees) {
			if(coffee.getName().equals(name)) { // 매개변수로 넘어온 이름을 가진 커피 객체를 찾음
				coffees.remove(coffee);
				return true;
			}
		}
		return false;
	}	
	
	// 메뉴 판매
	// 1. 이름을 받아와서 가격을 리턴하는 메소드
	// 2. 만약 sale이 true라면 10% 차감한 금액을 리턴
	public int sellMenu(String name) {
		int price = 0;
		for (Coffee coffee : coffees) {
			if(coffee.getName().equals(name)) {
				if(coffee.isSale()) { // 메뉴가 행사 진행 중이라면
					price = (int)(coffee.getPrice() * 0.9);
					
				}
				else {
					price = coffee.getPrice();
				}
				break;
			}
		}
		return price;
	}
	
	// 메뉴 카테고리 검색
	// 빙수 매개변수로 넘어오면 빙수 카테고리의 모든 메뉴를 리턴
	public ArrayList<Coffee> searchKind(String kind){
		ArrayList<Coffee> result = new ArrayList<>();
		
		for (Coffee coffee : coffees) {
			if(coffee.getKind().equals(kind)) {
				result.add(coffee);
			}
		}
		return result;
	}
}
