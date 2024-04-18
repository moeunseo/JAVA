package operator;

import java.util.Scanner;

public class Oper4 {
	public static void main(String[] args) {
		/* MBTI를 선택해서 MBTI 특징
		 * MBTI를 선택하세요.
		 * 1. ISFJ
		 * 2. INFP
		 * 3. ESTP
		 * 4. ENFP
		 * 
		 * ISFJ : 이건 내 mbti이 입니다.
		 * INFP : 창섭이 mbti
		 * ESTP : 이성 100%
		 * ENFP : 감당할 수 없는 에너지
		 * */
		
		String mainmsg = "mbti를 선택하세요\n1.ISFJ\n2.INFP\n3.ESTP\n4.ENFP";
		String chioceMsg = "입력 >>";
		String msg1= "이건 내 mbti야";
		String msg2= "창섭이 mbti";
		String msg3= "이성 100%";
		String msg4= "감당할 수 없는 에너지";
		String errorMsg = "잘못입력했습니다.";
		String resultMsg = null;
		int chioce = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(mainmsg);
		chioce = sc.nextInt();
		
		resultMsg = chioce==1? msg1 : 
					chioce==2? msg2 :
					chioce==3? msg3 :
					chioce==4? msg4 :
					errorMsg;
		
		System.out.println(resultMsg);
		
	}
}
