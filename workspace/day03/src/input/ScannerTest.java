package input;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = null;
		String msg = null;
		String firstname = null;
		String lastname = null;
		
		System.out.print("이름 입력:");
		name = sc.next();
		System.out.println("당신의 이름은 "+ name + "입니다.");
		
		//next()를 이용해서 문자열을 입력받고 엔터를 치게 되면
		// \n이 아직 시스템 상에 남아있게 되면서 이어서 작성하는
		//nextLine(), nextInt(), nextDouble() 엔터 기준으로 입력받는 친구들
		//입력 받기도 전에 입력이 끝났다고 판단하고 넘어감.
		// \n을 소비시키기 위함
		sc.nextLine();
		
		System.out.print("간단한 자기 소개: ");
		msg = sc.nextLine();
		System.out.println(msg);
		
		System.out.println("성과 이름을 엔터를 기준으로 입력하세요:");
		lastname = sc.next();
		firstname = sc.next();
		
		System.out.println(lastname+firstname+ "님 welcome");
		
		
	}
}
