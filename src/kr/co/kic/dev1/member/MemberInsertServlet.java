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
			// request ��ü�� ����ϱ� ���� �ڵ��ؾ� �Ѵ�.
			// �Ķ���� �߿��� �ѱ��� ������ ���� �ݵ�� �ڵ��ؾ� �Ѵ�.
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		MemberDto mdto = new MemberDto(id, email, password);
		MemberDao mdao = MemberDao.getInstance();
		
		if(mdao.insert(mdto)) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		
		response.sendRedirect("/member/join/success");
	}
}





