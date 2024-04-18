package joinTest;

import java.util.Scanner;

// 프로그램 관리 클래스
public class UserController {
	private final Scanner sc = new Scanner(System.in);
	private UserService us = new UserService();
	private String loginId = null;

	public UserController() {
		play();
	}

	// 실질적인 메인함수
	private void play() {
		System.out.println("☆★커뮤니티에 오신 걸 환영합니다.☆★");

		while (true) {
			System.out.println("1. 회원가입  2. 로그인 3. 종료");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: // 회원가입
				join();
				break;
			case 2: // 로그인
				login();
				break;
			case 3:
				System.out.println("프로그램 종료!");
				System.exit(0); // 프로그램 강제 종료
				break;
			default:
				System.out.println("번호 확인!");
			}
		}
	}

	private void join() {
		String id = null;
		String pw = null;
		String name = null;

		while (true) { // 중복되는 친구가 없을 때까지 계속 입력할 수 있도록
			System.out.println("q <- 뒤로가기");
			System.out.print("id: ");
			id = sc.next();

			if (id.equals("q")) {
				System.out.println("이전 화면으로~");
				return;
			}

			if (us.checkId(id) == null) {
				break;
			} else {
				System.out.println("이미 중복되는 아이디가 있습니다.");
			}
		}
		System.out.print("pw: ");
		pw = sc.next();
		System.out.print("name: ");
		name = sc.next();

		us.join(new User(id, pw, name));
		System.out.println("회원가입 완료!!");
	}

	private void login() {
		String id = null;
		String pw = null;

		while (loginId == null) {
			System.out.println("q <- 뒤로가기");
			System.out.print("id: ");
			id = sc.next();
			if (id.equals("q")) {
				System.out.println("이전 화면으로!");
				return;
			}

			System.out.println("q <- 뒤로가기");
			System.out.print("pw: ");
			pw = sc.next();
			if (id.equals("q")) {
				System.out.println("이전 화면으로!");
				return;
			}
			loginId = us.login(id, pw);
			if (loginId == null) {
				System.out.println("아이디 비밀번호 확인!");
			}
		}
		System.out.println(us.checkId(loginId).getName() + "님 환영합니다.");
		moveMyPage();
	}

	private void moveMyPage() {
		while (true) {
			System.out.println("1. 마이페이지  2. 이름변경 3. 로그아웃");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: // 마이페이지
				us.printData(us.checkId(loginId));
				break;
			case 2: // 이름 변경
				changeName();
				break;
			case 3: // 로그아웃
				System.out.println(us.checkId(loginId).getName()+ "님 로그아웃 합니다.");
				return;
			default:
				System.out.println("번호 확인!");

			}
		}
	}
	
	private void changeName() {
		String newName = null;
		System.out.println("new Name: ");
		newName = sc.next();
		
		us.changeName(loginId, newName);
	}
	
	// 비밀번호 찾기 기능 추가해보기
}
