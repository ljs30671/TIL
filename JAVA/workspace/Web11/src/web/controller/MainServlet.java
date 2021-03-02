package web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
       

    public MainServlet() {
        super();
        System.out.println("������ ȣ���");

    }

	public void init() throws ServletException {
		System.out.println("init ȣ���");
	}


	public void destroy() {
		System.out.println("destroy ȣ���");
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.service(request, response);
		System.out.println("service ȣ���");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet ȣ���");
		PrintWriter out=response.getWriter();
		out.append(getServletName());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost ȣ���");
	}

}
