package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;
import vo.PostVO;

public class PostDAO {
	private Connection con;
	private PreparedStatement pstm;
	private ResultSet rs;
	
	//검색된 게시글만 가져오기
	// 제목을 받아올거임
	// 나중에 웹페이지에서 할 땐 누가 작성했는지까지 가져오면 좋겠지? > join 써라!! memberNumber가져와서 해봐
	// 그러면 DTO를 만들어서 해야겠네 멤버 이름이 나와야하니깐
	public List<PostVO> selectAllpost(String title){
		String sql = "SELECT * FROM TBL_POST WHERE POST_TITLE LIKE ?";
		
		List<PostVO> posts = new ArrayList<>(); 
		
		try {
	         con = DBConnection.getConnection();
	         pstm = con.prepareStatement(sql);
	         pstm.setString(1, "%"+title+"%");
	         rs = pstm.executeQuery();
	         
	         // 결과 목록이 여러 개 일 수도 있으니 while문 돌리기
	         while (rs.next()) {
	        	 PostVO postVO = new PostVO();
	        	 postVO.setPostNumber(rs.getInt(1));
	        	 postVO.setPostTitle(rs.getString(2));
	        	 postVO.setpostContent(rs.getString(3));
	        	 postVO.setPostViews(rs.getInt(4));
	        	 postVO.setPostRegisterDate(rs.getString(5));
	        	 postVO.setMembernumber(rs.getInt(6));
		         posts.add(postVO);
		     }
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	         System.out.println("selectAllpost() 실행 중 에러");
	      } finally {
	         try {
	            DBConnection.close(con, pstm, rs);
	         } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.println("selectAllpost() 닫는 도중 에러");
	         }
	      }
		return posts;
	}
	
	// 게시글 조회순으로 목록 조회!
	public List<PostVO> selectSequencepost(){
		String sql = "SELECT *FROM TBL_POST\r\n"
				+ "ORDER BY POST_VIEWS DESC, POST_TITLE DESC";
		
		List<PostVO> posts = new ArrayList<>(); 
		
		try {
	         con = DBConnection.getConnection();
	         pstm = con.prepareStatement(sql);
	         rs = pstm.executeQuery();
	         
	         // 결과 목록이 여러 개 일 수도 있으니 while문 돌리기
	         while (rs.next()) {
	        	 PostVO postVO = new PostVO();
	        	 postVO.setPostNumber(rs.getInt(1));
	        	 postVO.setPostTitle(rs.getString(2));
	        	 postVO.setpostContent(rs.getString(3));
	        	 postVO.setPostViews(rs.getInt(4));
	        	 postVO.setPostRegisterDate(rs.getString(5));
	        	 postVO.setMembernumber(rs.getInt(6));

		         posts.add(postVO);
		     }
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	         System.out.println("selectSequencepost() 실행 중 에러");
	      } finally {
	         try {
	            DBConnection.close(con, pstm, rs);
	         } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.println("selectSequencepost() 닫는 도중 에러");
	         }
	      }
		return posts;
	}
}
