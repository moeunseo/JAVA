package util;

import java.sql.Connection;
import java.util.List;

import dao.UserDAO;
import dto.UserDTO;
import vo.UserVO;

public class Test {
   public static void main(String[] args) {
      
      UserDAO userDAO = new UserDAO();
      
//      selectAll() 
      List<UserVO> userList = userDAO.selectAll();
      System.out.println(userList);
      
//      회원가입 insert() 테스트
//      String name = "hogeun4";
//      
//      if(userDAO.checkId(name)) {
//         UserVO userVO = new UserVO(0, name, "1234", "홍길동", "010-45444-87424", "2022-12-25", 1);
//         userDAO.insert(userVO);
//      }
//      else {
//         System.out.println("중복 확인하세욧");
//      }
//      
//      userList = userDAO.selectAll();
//      System.out.println(userList);
      
      // selectOne() 테스트
//      UserVO user = userDAO.selectOne(1);
//      System.out.println(user);

      // updatePw() 테스트
//      userDAO.updatePw("010-1111-1111", "모은서짱");
      
      // delete() 테스트
//      if(userDAO.delete(2)==1) {
//    	  System.out.println("삭제완료!");
//	  }
      
      // userInfo() 테스트
//      UserDTO user = userDAO.userInfo(3);
//      System.out.println(user);
      
      // countRecommendr() 테스트
      int count = userDAO.countRecommendr(1);
      System.out.println("추천 수: "+ count);
   }
}