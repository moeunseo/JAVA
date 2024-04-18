package control;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		String mainmsg = "mbti를 선택하세요\n1.ISFJ\n2.INFP\n3.ESTP\n4.ENFP";
		String chioceMsg = "입력 >>";
		String msg1= "이건 내 mbti야";
		String msg2= "창섭이 mbti";
		String msg3= "이성 100%";
		String msg4= "감당할 수 없는 에너지";
		String errorMsg = "잘못 입력했습니다.";
		String resultMsg = null;
		int chioce = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(mainmsg);
		chioce = sc.nextInt();
		
		//break 잊지말고 꼭!! 적어주기
		switch (chioce) {
		case 1: 
			resultMsg = msg1;
			break;
		case 2: 
			resultMsg = msg2;
			break;
		case 3: 
			resultMsg = msg3;
			break;
		case 4: 
			resultMsg = msg4;
			break;
		default:
			resultMsg = errorMsg;
		}
		System.out.println(resultMsg);
	}
}
