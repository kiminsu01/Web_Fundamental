<%@page import ="kr.co.kic.dev1.dao.NoticeDao"%>
<%@page import ="kr.co.kic.dev1.dto.NoticeDto"%>
<%@ pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	String writer = request.getParameter("writer");
	String title = request.getParameter("title");
	String content = request.getParameter("content");

	NoticeDao dao = NoticeDao.getInstance();
	NoticeDto dto = new NoticeDto(writer,title,content);
	boolean isSuccess = dao.insert(dto);
	
%>

	