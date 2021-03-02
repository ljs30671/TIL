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
        System.out.println("ª˝º∫¿⁄ »£√‚µ ");

    }

	public void init() throws ServletException {
		System.out.println("init »£√‚µ ");
	}


	public void destroy() {
		System.out.println("destroy »£√‚µ ");
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.service(request, response);
		System.out.println("service »£√‚µ ");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet »£√‚µ ");
		PrintWriter out=response.getWriter();
		out.append(getServletName());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost »£√‚µ ");
	}

}
