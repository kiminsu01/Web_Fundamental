package kr.co.kic.dev1.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.kic.dev1.dao.MemberDao;
import kr.co.kic.dev1.dto.MemberDto;

/**
 * Servlet implementation class MemberInsertServlet1
 */
@WebServlet("/member/join")
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 public MemberInsertServlet() {
	        super(); 
	    }
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			// request 객체에 사용하기 전에 코딩해야 한다.
			// 파라미터 중에서 한글을 보내는 경우는 반드시 코딩해야 한다.
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		MemberDto mdto = new MemberDto(id, email, password);
		MemberDao mdao = MemberDao.getInstance();
		
		if(mdao.insert(mdto)) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		
		response.sendRedirect("/member/join/success");
	}
}





