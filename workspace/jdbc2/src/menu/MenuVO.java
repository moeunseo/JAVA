package menu;

// 테이블에서 *from을 때릴 때!
// insert를 주로할 때 사용
public class MenuVO {
	private int menuNumber;
	private String menuName;
	private int menuPrice;
	
	// 기본생성자는 무조건 만들자!
	public MenuVO() {;}

	public MenuVO(int menuNumber, String menuName, int menuPrice) {
		this.menuNumber = menuNumber;
		this.menuName = menuName;
		this.menuPrice = menuPrice;
	}

	// 가변성없이 값 그 자체이기 때문에 get만 존재!
	public int getMenuNumber() {
		return menuNumber;
	}
	
	public String getMenuName() {
		return menuName;
	}
	
	public int getMenuPrice() {
		return menuPrice;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof MenuVO) {
			if(this.menuNumber == ((MenuVO)obj).menuNumber) {
				return true;
			}
		}
		return false;
	}
}
