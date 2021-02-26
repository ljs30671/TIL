package web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/main")
public class MainServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		process(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		String sign=request.getParameter("sign");
		if(sign==null) {
			System.out.println("sign is null");
			return;
		}else if(sign.equals("memberInsert")) {
			
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String pw=request.getParameter("pw");
			String pw2=request.getParameter("pw2");
			String mobile=request.getParameter("mobile");
			String tel=request.getParameter("tel");
			String agree=request.getParameter("agree");
			System.out.println(name+email+pw+pw2+mobile+tel+agree);
			
			RequestDispatcher rd=request.getRequestDispatcher("memberInsert_ok.jsp");
			request.setAttribute("name", name);
			rd.forward(request, response);
			
		}else if(sign.equals("login")) {
			
			String id=request.getParameter("id");
			String pw=request.getParameter("pw");
			System.out.println(id);
			System.out.println(pw);
			
			RequestDispatcher rd=request.getRequestDispatcher("login_ok.jsp");
			request.setAttribute("id", id);
			rd.forward(request, response);
			
		}
		
		
	}

}
