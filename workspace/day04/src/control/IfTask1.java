package control;

import java.util.Scanner;

public class IfTask1 {
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
		
//		resultMsg = chioce==1? msg1 : 
//					chioce==2? msg2 :
//					chioce==3? msg3 :
//					chioce==4? msg4 :
//					errorMsg;
		
		if(chioce==1) {
			resultMsg = msg1;
		}
		else if(chioce==2) {
			resultMsg = msg2;
		}
		else if(chioce==3) {
			resultMsg = msg3;
		}
		else if(chioce==4) {
			resultMsg = msg4;
		}
		else {
			resultMsg = errorMsg;
		}
		
		System.out.println(resultMsg);
	}
}
