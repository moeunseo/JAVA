package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBConnection;

public class MemberDAO {
	private Connection con;
	private PreparedStatement pstm;
	private ResultSet rs;
	
	// 여자 회원이 몇명인지 리턴해주는 함수
	public int womanMember(String gender) {
		String sql = "SELECT COUNT(*)\r\n"
				+ "FROM TBL_MEMBER\r\n"
				+ "WHERE MEMBER_GENDER = ?";
		
		// count값을 받아오기 위한 변수
		int memberRow = 0;
		
		try {
	         con = DBConnection.getConnection();
	         pstm = con.prepareStatement(sql);
	         pstm.setString(1, gender);
	         rs = pstm.executeQuery();
	         
	         rs.next();
	         memberRow =rs.getInt(1);         
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	         System.out.println("womanMember() 도중 에러");
	      } finally {
	         try {
	            DBConnection.close(con, pstm, rs);
	         } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.println("womanMember() 닫는 도중 에러");
	         }
	      }
	      return memberRow; 
	}
}
