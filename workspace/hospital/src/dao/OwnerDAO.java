package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DBConnection;
import vo.OwnerVO;

public class OwnerDAO {
	private Connection con;
	private PreparedStatement pstm;
	private ResultSet rs;
	
	// 중복검사를 위한 메소드
	public boolean checkPhone(String phone) {
		String sql = "SELECT COUNT(OWNER_PHONE) FROM TBL_OWNER\r\n"
	            + "WHERE OWNER_PHONE = ?";
		
	      boolean check = false;
	      
	      try {
	         con = DBConnection.getConnection();
	         pstm = con.prepareStatement(sql);
	         pstm.setString(1, phone); // ?의 갯수로 1부터 시작
	         rs = pstm.executeQuery();
	         
//	       결과행 하나 가져오기.
	         rs.next();
	         
//	         id 를 만들 수 있으면 true
//	         중복이 없다면 true
	         // 즉, count가 1이 아닌 0이라면
	         check = rs.getInt(1) == 0;
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	         System.out.println("checkId() 실행 중 에러");
	      } finally {
	         try {
	            DBConnection.close(con, pstm, rs);
	         } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.println("checkId() 닫는 도중 에러");
	         }
	      }
		return check;
	}
	
	public OwnerVO selectOne(int loginUserNumber) {
		// 회원번호를 가져와 그 회원에 대한 정보만 볼거기 때문에 객체로!
		// selectAll이라면 리스트로 받아와야함
		OwnerVO owner = new OwnerVO();
		
		// 회원번호를 가져와서 전체정보를 확인할 수 있다.
		// 내 정보기록보기 위한 메소드
		String sql = "select *from tbl_owner where owner_number = ?";
		try {
	         con = DBConnection.getConnection();
	         pstm = con.prepareStatement(sql);
	         pstm.setInt(1, loginUserNumber);
	         rs = pstm.executeQuery();
	         
//	       결과행 하나 가져오기.
	         rs.next();
	         
	         owner.setOwnerNumber(rs.getInt(1));
	         owner.setOwnerName(rs.getString(2));
	         owner.setOwnerPhone(rs.getString(3));
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	         System.out.println("selectOne() 실행 중 에러");
	      } finally {
	         try {
	            DBConnection.close(con, pstm, rs);
	         } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.println("selectOne() 닫는 도중 에러");
	         }
	      }
		return owner;
	}
	
	// 회원가입 메소드
	// 회원가입을 눌렀을 때 진행되었을 때 실행되는 메소드!
	// 중복검사는 이전에 실행되는 것이 좋아
	public void join(String name, String phone) {
		  String sql = "INSERT INTO TBL_OWNER\r\n"
		            + "(OWNER_NUMBER, OWNER_NAME, OWNER_PHONE)\r\n"
		            + "VALUES(SEQ_PRO.NEXTVAL, ?, ?)";
		      
		      try {
		         con = DBConnection.getConnection();
		         pstm = con.prepareStatement(sql);
		         pstm.setString(1, name);
		         pstm.setString(2, phone);
		         pstm.executeUpdate();
		         
		      } catch (SQLException e) {
		         e.printStackTrace();
		         System.out.println("join() 도중 에러");
		      } finally {
		         try {
		            DBConnection.close(con, pstm);
		         } catch (SQLException e) {
		            e.printStackTrace();
		            System.out.println("join() 닫는 도중 에러");
		         }
		      }
	}
	// 로그인 메소드
	 public int login(String name, String phone) {  
	      String sql = "SELECT OWNER_NUMBER FROM TBL_OWNER\r\n"
	            + "WHERE OWNER_NAME = ? AND OWNER_PHONE = ?";
	      
	      int loginUserNumber = 0;
	      
	      try {
	         con = DBConnection.getConnection();
	         pstm = con.prepareStatement(sql);
	         pstm.setString(1, name);
	         pstm.setString(2, phone);
	         rs = pstm.executeQuery();
	         
//	         결과행 하나 가져오기.
	         if(rs.next()) { // true로 리턴!
	            loginUserNumber = rs.getInt(1);
	         }
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	         System.out.println("login() 실행 중 에러");
	      } finally {
	         try {
	            DBConnection.close(con, pstm, rs);
	         } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.println("login() 닫는 도중 에러");
	         }
	      }
	      return loginUserNumber;
	   }
}