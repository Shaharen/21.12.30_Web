package com.smhrd.servlet1230;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumberPlus")
public class Ex04NumberPlus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		String data = request.getParameter("data");
		String data2 = request.getParameter("data2");
		// ���ڿ� -> ���� ��ȯ : Integer.parseInt()
		int i = Integer.parseInt(data);
//		int i = Integer.parseInt(request.getParameter("data"));
		int j = Integer.parseInt(data2);
		int result = i + j ;

		out.print("<html><head><title>������</title></head>");
		out.print("<body>"+ "ù��° �Է��� �� : "+ data + "<br>");
		out.print("�ι�° �Է��� �� : " + data2 + "<br>");
		out.print("�� ���� �� : " + result);
		out.print("</body></html>");
	}

}
