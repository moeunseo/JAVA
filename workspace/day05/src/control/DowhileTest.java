package control;

import java.util.Scanner;

public class DowhileTest {
	public static void main(String[] args) {
	      String msg = "1. 통신요금 조회\n2. 번호 이동\n3. 분실 신고\n0. 상담원 연결";
	      Scanner sc = new Scanner(System.in);
	      int choice = 0;
	      
//	      while(choice != 0) {
//	         System.out.println(msg);
//	         choice = sc.nextInt();
//	      }
	      
	      do{
	         System.out.println(msg);
	         choice = sc.nextInt();
	      }while(choice != 0); 
	}
}
